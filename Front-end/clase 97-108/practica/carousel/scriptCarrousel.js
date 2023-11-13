
const prevButton = document.getElementById("prevBtn");
const nextButton = document.getElementById("nextBtn");
const carousel = document.getElementById("carouselX");

let currentIndex = 0;

function showImage(index) {
  carousel.style.transform = `translateX(-${index * 100}%)`;
}

prevButton.addEventListener("click", () => {
  currentIndex = (currentIndex - 1 + carousel.childElementCount) % carousel.childElementCount;
  showImage(currentIndex);
});

nextButton.addEventListener("click", () => {
  currentIndex = (currentIndex + 1) % carousel.childElementCount;
  showImage(currentIndex);
});

showImage(currentIndex);