package kosta.selfMission.others.multiThreading;


class Task1 extends Thread {
    @Override
    public void run() {
        System.out.println("task1 start");
        for (int i = 101; i <= 199; i++) {
            System.out.print(i + " ");
        }

        System.out.print("\n task1 done");
    }
}

class Task2 implements Runnable{

    @Override
    public void run() {
        System.out.println("task2 start");
        for (int i = 201; i <= 299; i++) {
            System.out.print(i + " ");
        }

        System.out.print("\n task2 done");

    }
}

public class ThreadMain {
    public static void main(String[] args) {


    }

    private static void threadExample() {
        // thread를 생성하는 두 가지 방식
        // extends Thread
        // implements Runnable

        Task1 task1 = new Task1();
        task1.start();
        // task1.run() 이 아니라 start()를 한다는 것에 주목 => run 은 병렬처리 x

        Task2 task2 = new Task2();
        Thread task2Thread = new Thread(task2);
        task2Thread.start();

        // Task 3
        System.out.print("task3 start");
        for (int i = 301; i <= 399; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n task3 done");
        System.out.println("\n main done");


        /**
         * task1 start
         * task3 starttask2 start
         * 101 102 103 104 105 106 107 108 109 110 111 112 113 114 115 116 117 118 119 120 121 122 123 124 125 126 127 301 302 303 304 305 306 307 308 309 310 311 312 313 314 315 316 317 318 319 320 321 128 129 130 131 132 133 134 135 136 137 138 139 140 141 142 143 144 145 146 147 148 149 150 151 152 153 154 155 156 201 202 203 204 205 206 207 208 209 210 211 212 213 214 215 216 217 218 219 220 221 222 223 224 225 226 227 228 229 230 231 232 233 234 235 236 237 238 239 240 241 242 243 244 245 246 247 248 249 250 251 252 253 254 255 256 257 258 259 260 261 262 263 264 265 266 267 268 269 270 271 272 273 274 275 276 277 278 279 157 322 323 324 158 280 281 159 160 161 162 163 164 165 166 167 168 169 325 326 327 328 329 330 331 332 170 171 172 173 174 175 176 177 178 179 180 181 182 183 184 185 186 187 188 189 190 191 192 193 194 195 196 197 198 199
         *  task1 done282 283 284 285 286 287 288 289 290 333 334 335 336 291 337 338 339 340 341 342 343 344 345 346 347 292 293 294 348 349 350 351 352 353 354 295 296 297 298 299
         *  task2 done355 356 357 358 359 360 361 362 363 364 365 366 367 368 369 370 371 372 373 374 375 376 377 378 379 380 381 382 383 384 385 386 387 388 389 390 391 392 393 394 395 396 397 398 399
         *  task3 done
         *
         *  main done
         */

        // NEW; => 스레드가 처음 생성될 때  (start 이전)
        // RUNNABLE;  실행 중이긴 하지만 현재 실행은 다른 스레드가 맡고 있는 경우
        // RUNNING;   실제로 수행이 되고 있는 경우
        // BLOCKED or WAITING  외부 인터페이스나 데이터베이스로부터 어떤 입력을 위해 대기
        // TERMINATED or DEAD  스레드가 실행이 다 완료된 상태
    }

    private static void basicWorkFlow() {
        // Task 1
        for (int i = 101; i <= 199; i++) {
            System.out.println(i + " ");
        }

        System.out.println("\n task1 done");

        // Task 2
        for (int i = 201; i <= 299; i++) {
            System.out.println(i + " ");
        }

        System.out.println("\n task2 done");

        // Task 3
        for (int i = 301; i <= 399; i++) {
            System.out.println(i + " ");
        }

        System.out.println("\n task3 done");
        System.out.println("\n main done");
    }
}
