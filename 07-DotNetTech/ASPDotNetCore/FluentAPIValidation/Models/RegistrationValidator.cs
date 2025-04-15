using FluentValidation;
namespace FluentAPIValidation.Models
{
    public class RegistrationValidator : AbstractValidator<RegistrationModel>
    {
        public RegistrationValidator()
        {
            RuleFor(r => r.Username)
            .NotNull().WithMessage("Username is Required")
            .NotEmpty().WithMessage("Username cannot be Empty")
            .Length(5, 30).WithMessage("Username must be between 5 and 30 characters");
            RuleFor(r => r.Password)
                .NotNull().WithMessage("Password is Required")
                .NotEmpty().WithMessage("Password cannot be Empty")
                .Length(6, 50).WithMessage("Password must be between 6 and 50 Characters.")
                .Matches("(?!^[0-9]*$)(?!^[a-zA-Z]*$)^([a-zA-Z0-9]{2,})$").WithMessage("Password can only contain alphanumeric characters");
            RuleFor(r => r.ConfirmPassword)
                .Equal(r => r.Password).WithMessage("Confirm Password must match Password");
            RuleFor(r => r.Email)
                .NotEmpty().WithMessage("Email is required")
                .EmailAddress().WithMessage("Invalid Email Format")
                .NotEqual("admin@example.com").WithMessage("This Email is Not Allowed");
        }
    }
}