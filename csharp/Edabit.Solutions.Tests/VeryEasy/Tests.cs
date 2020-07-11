using System;
using NUnit.Framework;


namespace Edabit.Solutions.Tests.VeryEasy
{
    public class Tests
    {
        [Test]
        [TestCase(Result = true)]
        public static bool FixedTest()
        {
            return Program.ReturnTrue();
        }
    }
}
