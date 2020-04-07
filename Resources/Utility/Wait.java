package Utility;

import java.util.concurrent.TimeUnit;

import Base.BaseTest;

public class Wait extends BaseTest
{
	public static void implictwait(int n)
	{
		driver.manage().timeouts().implicitlyWait(n, TimeUnit.SECONDS);
	}

}
