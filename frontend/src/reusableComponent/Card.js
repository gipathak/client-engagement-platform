import React from 'react';

const Card = ({ image, name, description, type, date }) => {
  return (
    <div className="card-container">
      <img src={image} alt={name} />
      <span>{name}</span>
      <span>{description}</span>
      <span>{type}</span>
      <span>{date}</span>
    </div>
  );
};

export default Card;
