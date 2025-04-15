﻿namespace ControllersExample.Models
{
    // Model Classs
    public class Person
    {
        public Guid Id { get; set; } // will generate unique value
        public string? FirstName { get; set; }
        public string? LastName { get; set; }
        public int Age { get; set; }
    }
}
