package coccal;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		String[] a={".114.114.288.126.217.206.001.230.314.104.111.347.092.192.196.125.211.189.058.124.363",
				".061.212.285.217.109.219.172.183.196.206.229.114.016.159.387.078.106.308.143.202.116",
				".060.139.259.158.222.081.193.147.118.057.161.317.181.199.169.211.131.198.-14.210.291",
				".055.270.223.135.142.203.016.249.291.164.102.287.086.163.306.220.142.187.094.189.197",
				".100.253.211.078.147.334.003.120.357.126.158.262.011.101.453.259.181.129.023.207.250",
				".-05.221.340.127.146.286.244.217.103.221.252.090.200.159.121.072.161.326.259.208.083",
				".172.117.191.170.157.233.071.102.389.244.121.194.194.164.190.029.120.416.047.104.396",
				".113.262.189.138.159.266.027.177.276.226.120.204.089.224.249.242.234.083.113.169.275",
				".206.106.168.103.147.319.139.167.253.192.168.205.005.202.355.061.148.271.051.268.228",
				".190.147.222.048.174.335.231.229.100.202.146.197.037.243.278.-05.165.409.175.115.204",
				".196.104.180.245.222.068.070.122.357.194.145.201.033.100.354.176.248.142.197.185.167",
				".140.234.106.167.264.120.014.241.304.010.134.420.008.228.244.233.200.112.-02.158.324",
				".023.273.260.271.261.027.178.226.160.051.162.267.165.205.189.260.214.076.175.100.205",
				".097.180.184.047.202.209.179.221.061.204.136.118.098.220.230.235.159.165.056.185.310",
				".236.149.178.196.157.127.014.274.276.006.111.442.073.201.206.128.194.233.218.173.162",
				".-10.173.393.030.168.358.021.212.248.156.165.159.221.147.160.-10.101.465.146.268.135",
				".119.246.180.064.178.321.188.159.202.100.210.170.268.157.138.002.205.342.260.123.175",
				".156.274.118.205.187.088.271.194.080.101.119.260.195.162.191.268.193.101.215.102.248",
				".-05.118.438.137.186.157.275.235.054.033.236.290.095.209.176.245.180.081.148.107.206",
				".216.167.075.077.220.164.123.208.127.203.132.181.228.110.221.168.146.237.032.152.379",
				".008.232.240.144.119.261.262.203.094.136.218.212.082.101.366.266.182.114.-08.177.292",
				".067.183.208.051.125.321.164.221.112.166.110.204.100.107.319.163.128.268.142.271.149",
				".186.240.138.126.205.221.022.236.309.057.207.295.191.175.193.069.107.372.135.192.153",
				".150.187.193.137.237.174.141.120.231.171.192.117.066.179.286.248.205.092.025.214.319",
				".058.169.253.014.132.367.160.216.182.182.148.218.-07.266.303.219.179.151.081.211.253",
				".272.249.042.172.198.122.011.237.232.221.152.128.179.101.219.000.177.321.194.178.126",
				".248.177.073.176.184.120.227.133.173.145.237.143.092.246.187.182.149.163.187.160.114",
				".040.188.230.195.131.135.106.226.126.185.110.233.118.218.158.012.140.328.192.142.194",
				".067.233.253.027.267.261.256.238.051.046.263.238.068.149.335.258.255.052.000.193.361",
				".185.233.127.124.170.264.141.150.260.042.127.292.209.164.085.149.238.143.214.276.063",
				".050.210.303.166.256.133.080.151.249.093.219.213.206.179.160.153.217.188.158.227.160",
				".018.141.392.161.192.196.137.205.220.-18.190.289.160.134.164.123.188.205.041.172.346",
				".081.272.198.262.203.098.041.148.335.095.256.208.087.165.314.132.257.160.123.190.249"};
		for(int i=0;i<a.length;i++)
			test(a[i]);
	}
	public static  void test(String x) {
		//Scanner in = new Scanner(System.in);
		//String text = in.nextLine();
		String text =x;
		if(text.charAt(0)=='.')
			text =text.substring(1, text.length());
//		System.out.println(text);
		String pass = "1";
		int password = 0;
		int sum=0;
		for(int i=0;i<pass.length();i++){
			int temp = (int)pass.charAt(i);
			password +=temp;
		}
//		System.out.println(password);
		password=448;
		String[] num = text.split("\\.");
		String ans ="";
		//System.out.println(num[0]);
		for(int i=0;i<num.length;i+=3){
			
					//System.out.println(i);
					int temp = Integer.parseInt(num[i]) +Integer.parseInt(num[i+1])+Integer.parseInt(num[i+2]);
//					System.out.println(num[i]+"+"+num[j]+"+"+num[k]);
//					System.out.println(temp);
					sum = temp - password;
					ans +=(char)sum;
//					System.out.println(sum);
//					System.out.println((char)sum);
					
				
		}
//		System.out.println(num[3]);
//		System.out.println(num[4]);
//		System.out.println(num[5]);
		System.out.print(ans);
	}
}
