using Microsoft.AspNetCore.Mvc;
using System;

namespace TemperatureConverter.Controllers
{
    [ApiController]
    [Route("[controller]")]
    public class TemperatureController : ControllerBase
    {
        [HttpPost]
        public IActionResult Convert([FromBody] TemperatureRequest request)
        {
            if (request == null || !ModelState.IsValid)
            {
                return BadRequest("Se requiere la temperatura en grados Fahrenheit.");
            }

            if (!double.TryParse(request.Fahrenheit, out double fahrenheit))
            {
                return BadRequest("La temperatura debe ser un número.");
            }

            double celsius = FahrenheitToCelsius(fahrenheit);
            return Ok(new { Celsius = celsius });
        }

        private double FahrenheitToCelsius(double fahrenheit)
        {
            return (fahrenheit - 32) * 5.0 / 9.0;
        }
    }

    public class TemperatureRequest
    {
        public string Fahrenheit { get; set; }
    }
}
