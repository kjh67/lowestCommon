/*
 * Copyright 2021 K.J. Hawkins <kjh67@cam.ac.uk>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.ac.cam.kjh67.lowestCommon;

public class Main {

    public int x=0;
    public void Main() {
        this.x=7;
    }

    public static void main(String[] args) {
        /*long long1 = 3L;
        long long2 = 2L;
        System.out.println(lowestCommon(long1,long2));*/
        Main m = new Main();
        //m.Main();
        System.out.println(m.x);
    }

    public static int lowestCommon(Long long1, Long long2) {
        // iterate over the longs; use a counter up to 64
        // which, if reached will stop
        int position = -1;
        int i = 0;
        while (i < 64) {
            if (((long1 & 1) == 1) && ((long2 & 1) == 1)) {
                position = i;
                break;
            }
            long1 = long1 >> 1;
            long2 = long2 >> 1;
            i++;
        }
        return position;
    }
}
