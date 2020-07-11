using System;
using Practice.Edabit.Solutions.App;
using Xunit;

namespace Practice.Edabit.Tests
{
    public class Tests
    {
        [Theory]
        [InlineData(12, 13)]
        [InlineData(24, 29)]
        [InlineData(11, 11)]
        [InlineData(13, 13)]
        [InlineData(14, 17)]
        [InlineData(33, 37)]
        public static void NextPrime(int num, int expected)
        {
            // action
            var actual = Program.NextPrime(num);

            // assert
            Assert.Equal(expected, actual);
        }
    }
}
