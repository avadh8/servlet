<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Stylish Buttons</title>
  <style>
    body {
      display: flex;
      justify-content: center;
      align-items: center;
      height: 100vh;
      background: #f0f0f0;
      font-family: Arial, sans-serif;
    }

    .button-container {
      display: flex;
      gap: 20px;
    }

    /* Button 1 - Glow Effect */
    .button-glow {
      padding: 15px 30px;
      font-size: 16px;
      color: #fff;
      background-color: #6200ea;
      border: none;
      border-radius: 8px;
      cursor: pointer;
      box-shadow: 0 0 10px rgba(98, 0, 234, 0.5);
      transition: all 0.3s ease;
    }

    .button-glow:hover {
      box-shadow: 0 0 20px rgba(98, 0, 234, 0.8), 0 0 30px rgba(98, 0, 234, 0.5);
      transform: scale(1.1);
    }

    /* Button 2 - Sliding Border */
    .button-slide {
      padding: 15px 30px;
      font-size: 16px;
      color: #6200ea;
      background-color: transparent;
      border: 2px solid #6200ea;
      border-radius: 8px;
      cursor: pointer;
      position: relative;
      overflow: hidden;
      transition: color 0.3s ease;
    }

    .button-slide::before {
      content: "";
      position: absolute;
      top: 0;
      left: -100%;
      width: 100%;
      height: 100%;
      background: #6200ea;
      z-index: -1;
      transition: all 0.4s ease;
    }

    .button-slide:hover::before {
      left: 0;
    }

    .button-slide:hover {
      color: #fff;
    }
  </style>
</head>
<body>
  <div class="button-container">
    <button class="button-glow"><a href="web">first servlet </a></button>
    <button class="button-slide"><a href="second">second servlet </a></button>
  </div>
</body>
</html>
