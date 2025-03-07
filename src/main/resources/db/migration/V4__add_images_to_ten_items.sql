UPDATE pneu
SET image_url = CASE
    WHEN id = 1 THEN 'https://static.vecteezy.com/system/resources/previews/009/380/151/non_2x/car-tyre-clipart-design-illustration-free-png.png'
    WHEN id = 2 THEN 'https://static.vecteezy.com/system/resources/previews/009/398/543/non_2x/car-tyre-clipart-design-illustration-free-png.png'
    WHEN id = 3 THEN 'https://static.vecteezy.com/system/resources/previews/009/400/602/non_2x/car-tyre-clipart-design-illustration-free-png.png'
    WHEN id = 4 THEN 'https://static.vecteezy.com/system/resources/previews/009/342/587/non_2x/car-tyre-clipart-design-illustration-free-png.png'
    WHEN id = 5 THEN 'https://w7.pngwing.com/pngs/978/475/png-transparent-alloy-wheel-tire-car-porsche-car.png'
    WHEN id = 6 THEN 'https://e7.pngegg.com/pngimages/636/890/png-clipart-tire-hubcap-car-alloy-wheel-car-transport-rim.png'
    WHEN id = 7 THEN 'https://w7.pngwing.com/pngs/913/794/png-transparent-hubcap-car-tire-driving-spoke-tire-care.png'
    WHEN id = 8 THEN 'https://w7.pngwing.com/pngs/711/551/png-transparent-scooter-car-bridgestone-motorcycle-tire-scooter-scooter-car-motorcycle.png'
    WHEN id = 9 THEN 'https://tyre-images.pirelli.com/MKTData/MOTO/files/2071/mototopimage/pirelli_moto_diablo_rosso_2_base_992x992.png'
    WHEN id = 10 THEN 'https://tyre-images.pirelli.com/MKTData/MOTO/files/1748/mototopimage/pirelli_moto_sport_demon_base_992x992.png'
END;