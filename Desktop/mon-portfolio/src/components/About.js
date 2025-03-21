import React from 'react';
import './About.css';
import imageFenohasina from '../Photos/Fenohasina-removebg-preview.png';

function About() {
  return (
    <section className="about">
      <div className="about-left">
        <h2>A propos de moi</h2>
        <p>
          Je suis un développeur passionné par la création d'interfaces modernes et dynamiques...
        </p>
      </div>
      <div className="about-right">
        <img src={imageFenohasina} alt="A propos de moi" />
      </div>
    </section>
  );
}

export default About;
