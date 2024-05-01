function initMap() {
    const map = new google.maps.Map(document.getElementById("map"), {
      zoom: 13,
      center: { lat: 43.285555, lng:  76.948199},
    });
  
    setMarkers(map);
  }
  
  const toyota_centers = [
    ["Zheti-Su", 43.243286, 76.826037],
    ["Kuldzha", 43.317847, 77.024709],
    ["Suyunbai", 43.286760, 76.948284],
  ];
  
  function setMarkers(map) {
    const image = {
      url: "http://maps.google.com/mapfiles/ms/icons/red-dot.png",
    };

    for (let i = 0; i < toyota_centers.length; i++) {
      const centers = toyota_centers[i];
      new google.maps.Marker({
        position: { lat: centers[1], lng: centers[2] },
        map,
        icon: image,
        title: centers[0],
      });
    }
  }
  
  window.initMap = initMap;