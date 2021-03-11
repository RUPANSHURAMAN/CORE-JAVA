package p1;

/*										  	 ====			===============
 * Br1-------------------------------------> |t1|			|  =====	  |
 * 	.									  	 ====			|  |   |      |
 * 	.											|			|  |---|	  |
 *	.									  ====	|			|  |---|	  |
 * Br50----------------------------------> |t2|	|			| =========== |
 * 	.									  ====	|			| |			| |
 * 	.										 |	|			| | Tomacat | |
 * 	.								    ==== |	|			| |			| |
 * Br1--------------------------------> |t3| |	|			| =========== |
 * 	.									==== |	|			===============
 *  .									  |	 |	|
 * Br100000000------------------------>	  |	 |	|
 *  									  $	 $	$	Note: Thread not destroyed but kept in pool
 *  
 *  								|	t1, t2, t3,,.,.,.,.		|
 *    								|		,.,.,.,.,..			|
 *      							|		,.,..				|
 *   								|	,.,..,t100000000		|
 *   								|							|
 *   								=============================
 *   										Thread Pool
 *   
 *   Threads concept is ideally used for server side implementation to build applications like tomcat.
 *   
 *   For every incoming request a thread will be picked up from Thread Pool and will be assigned to 
 *   handle the request.
 *   
 *   Thread Pool is collections of thread. When the request is handled using a thread we can perform 
 *   multitasking and hence it will give a feel to user that all the request are being processed at once.
 *   Once the request is handled we put the thread back to ThreadPool.
 *   
 *   Everytime we don't create the thread and destroy the thread becoz that will reduce the efficiency
 *   rather after the usage of thread it will be stored back in Thread Pool for further reusage. This helps
 *   us to increase efficiency and performance of server.
 */