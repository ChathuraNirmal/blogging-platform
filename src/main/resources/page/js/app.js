let title = document.getElementById("blog-title");
let tags = document.getElementById("blog-tags");
let category = document.getElementById("blog-category");
let imageURL = document.getElementById("blog-image-url");
let content = document.getElementById("blog-content");
let btnPublishOnClick = document.getElementById("blog-publish-onclick");

function btnPublishOnClickFunc() {
  console.log("dasedd");

  let requestBody = {
    title: title.value,
    tags: tags.value,
    category: category.value,
    imgURL: imageURL.value,
    content: content.value,
  };

  fetch("http://localhost:8080/set-data", {
    method: "POST",
    body: JSON.stringify(requestBody),
    headers: {
      "Content-Type": "application/json",
    },
  }).then((data) => {
    console.log("succesfull");
  });
};

let cards = document.getElementById("blog-container");

fetch("http://localhost:8080/get-data")
  .then(res => res.json())
.then(blogs =>{

    let blogCards = ""

    blogs.forEach(blog => {
        
          cards.innerHTML +=`<div class="max-w-sm m-4 rounded-2xl overflow-hidden bg-white shadow-md border border-gray-200 transition-transform hover:scale-105 hover:shadow-lg">
  <img class="w-full h-48 object-cover" src="${blog.imgURL}" alt="blog image" />

  <div class="p-5">
    <h2 class="text-xl font-bold text-gray-900 mb-2">${blog.title}</h2>

    <p class="text-sm text-gray-700 mb-3">
      ${blog.content.length > 120 ? blog.content.substring(0, 120) + '...' : blog.content}
    </p>

    <div class="flex flex-wrap items-center text-xs text-gray-500 gap-2 mb-3">
      ${blog.tags
        .split(',')
        .map(tag => `<span class="bg-gray-100 px-2 py-0.5 rounded-full">#${tag.trim()}</span>`)
        .join('')}
      <span class="ml-auto text-xs font-medium italic">${blog.category}</span>
    </div>

    <div class="flex items-center justify-between text-sm text-gray-600">
      <span class="font-medium">💬 ${blog.commentsCount || 0} Comments</span>
      <span class="text-xs italic">${blog.createdAt ? new Date(blog.createdAt).toLocaleDateString() : ''}</span>
    </div>
  </div>
</div>

`

    })
    
  

});

btnPublishOnClick.addEventListener("click", btnPublishOnClickFunc);
