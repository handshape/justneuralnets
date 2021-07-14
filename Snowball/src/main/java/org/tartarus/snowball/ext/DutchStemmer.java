// Generated by Snowball 2.0.0 - https://snowballstem.org/

package org.tartarus.snowball.ext;

import org.tartarus.snowball.Among;

/**
 * This class implements the stemming algorithm defined by a snowball script.
 * <p>
 * Generated by Snowball 2.0.0 - https://snowballstem.org/
 * </p>
 */
@SuppressWarnings("unused")
public class DutchStemmer extends org.tartarus.snowball.SnowballStemmer {

    private static final long serialVersionUID = 1L;

    private final static Among a_0[] = {
            new Among("", -1, 6),
            new Among("\u00E1", 0, 1),
            new Among("\u00E4", 0, 1),
            new Among("\u00E9", 0, 2),
            new Among("\u00EB", 0, 2),
            new Among("\u00ED", 0, 3),
            new Among("\u00EF", 0, 3),
            new Among("\u00F3", 0, 4),
            new Among("\u00F6", 0, 4),
            new Among("\u00FA", 0, 5),
            new Among("\u00FC", 0, 5)
    };

    private final static Among a_1[] = {
            new Among("", -1, 3),
            new Among("I", 0, 2),
            new Among("Y", 0, 1)
    };

    private final static Among a_2[] = {
            new Among("dd", -1, -1),
            new Among("kk", -1, -1),
            new Among("tt", -1, -1)
    };

    private final static Among a_3[] = {
            new Among("ene", -1, 2),
            new Among("se", -1, 3),
            new Among("en", -1, 2),
            new Among("heden", 2, 1),
            new Among("s", -1, 3)
    };

    private final static Among a_4[] = {
            new Among("end", -1, 1),
            new Among("ig", -1, 2),
            new Among("ing", -1, 1),
            new Among("lijk", -1, 3),
            new Among("baar", -1, 4),
            new Among("bar", -1, 5)
    };

    private final static Among a_5[] = {
            new Among("aa", -1, -1),
            new Among("ee", -1, -1),
            new Among("oo", -1, -1),
            new Among("uu", -1, -1)
    };

    private static final char g_v[] = {17, 65, 16, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 128};

    private static final char g_v_I[] = {1, 0, 0, 17, 65, 16, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 128};

    private static final char g_v_j[] = {17, 67, 16, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 128};

    private int I_p2;
    private int I_p1;
    private boolean B_e_found;


    private boolean r_prelude() {
        int among_var;
        // (, line 41
        // test, line 42
        int v_1 = cursor;
        // repeat, line 42
        while (true) {
            int v_2 = cursor;
            lab0:
            {
                // (, line 42
                // [, line 43
                bra = cursor;
                // substring, line 43
                among_var = find_among(a_0);
                if (among_var == 0) {
                    break lab0;
                }
                // ], line 43
                ket = cursor;
                switch (among_var) {
                    case 1:
                        // (, line 45
                        // <-, line 45
                        slice_from("a");
                        break;
                    case 2:
                        // (, line 47
                        // <-, line 47
                        slice_from("e");
                        break;
                    case 3:
                        // (, line 49
                        // <-, line 49
                        slice_from("i");
                        break;
                    case 4:
                        // (, line 51
                        // <-, line 51
                        slice_from("o");
                        break;
                    case 5:
                        // (, line 53
                        // <-, line 53
                        slice_from("u");
                        break;
                    case 6:
                        // (, line 54
                        // next, line 54
                        if (cursor >= limit) {
                            break lab0;
                        }
                        cursor++;
                        break;
                }
                continue;
            }
            cursor = v_2;
            break;
        }
        cursor = v_1;
        // try, line 57
        int v_3 = cursor;
        lab1:
        {
            // (, line 57
            // [, line 57
            bra = cursor;
            // literal, line 57
            if (!(eq_s("y"))) {
                cursor = v_3;
                break lab1;
            }
            // ], line 57
            ket = cursor;
            // <-, line 57
            slice_from("Y");
        }
        // repeat, line 58
        while (true) {
            int v_4 = cursor;
            lab2:
            {
                // goto, line 58
                golab3:
                while (true) {
                    int v_5 = cursor;
                    lab4:
                    {
                        // (, line 58
                        if (!(in_grouping(g_v, 97, 232))) {
                            break lab4;
                        }
                        // [, line 59
                        bra = cursor;
                        // or, line 59
                        lab5:
                        {
                            int v_6 = cursor;
                            lab6:
                            {
                                // (, line 59
                                // literal, line 59
                                if (!(eq_s("i"))) {
                                    break lab6;
                                }
                                // ], line 59
                                ket = cursor;
                                if (!(in_grouping(g_v, 97, 232))) {
                                    break lab6;
                                }
                                // <-, line 59
                                slice_from("I");
                                break lab5;
                            }
                            cursor = v_6;
                            // (, line 60
                            // literal, line 60
                            if (!(eq_s("y"))) {
                                break lab4;
                            }
                            // ], line 60
                            ket = cursor;
                            // <-, line 60
                            slice_from("Y");
                        }
                        cursor = v_5;
                        break golab3;
                    }
                    cursor = v_5;
                    if (cursor >= limit) {
                        break lab2;
                    }
                    cursor++;
                }
                continue;
            }
            cursor = v_4;
            break;
        }
        return true;
    }

    private boolean r_mark_regions() {
        // (, line 64
        I_p1 = limit;
        I_p2 = limit;
        // gopast, line 69
        golab0:
        while (true) {
            lab1:
            {
                if (!(in_grouping(g_v, 97, 232))) {
                    break lab1;
                }
                break golab0;
            }
            if (cursor >= limit) {
                return false;
            }
            cursor++;
        }
        // gopast, line 69
        golab2:
        while (true) {
            lab3:
            {
                if (!(out_grouping(g_v, 97, 232))) {
                    break lab3;
                }
                break golab2;
            }
            if (cursor >= limit) {
                return false;
            }
            cursor++;
        }
        // setmark p1, line 69
        I_p1 = cursor;
        // try, line 70
        lab4:
        {
            // (, line 70
            if (!(I_p1 < 3)) {
                break lab4;
            }
            I_p1 = 3;
        }
        // gopast, line 71
        golab5:
        while (true) {
            lab6:
            {
                if (!(in_grouping(g_v, 97, 232))) {
                    break lab6;
                }
                break golab5;
            }
            if (cursor >= limit) {
                return false;
            }
            cursor++;
        }
        // gopast, line 71
        golab7:
        while (true) {
            lab8:
            {
                if (!(out_grouping(g_v, 97, 232))) {
                    break lab8;
                }
                break golab7;
            }
            if (cursor >= limit) {
                return false;
            }
            cursor++;
        }
        // setmark p2, line 71
        I_p2 = cursor;
        return true;
    }

    private boolean r_postlude() {
        int among_var;
        // repeat, line 75
        while (true) {
            int v_1 = cursor;
            lab0:
            {
                // (, line 75
                // [, line 77
                bra = cursor;
                // substring, line 77
                among_var = find_among(a_1);
                if (among_var == 0) {
                    break lab0;
                }
                // ], line 77
                ket = cursor;
                switch (among_var) {
                    case 1:
                        // (, line 78
                        // <-, line 78
                        slice_from("y");
                        break;
                    case 2:
                        // (, line 79
                        // <-, line 79
                        slice_from("i");
                        break;
                    case 3:
                        // (, line 80
                        // next, line 80
                        if (cursor >= limit) {
                            break lab0;
                        }
                        cursor++;
                        break;
                }
                continue;
            }
            cursor = v_1;
            break;
        }
        return true;
    }

    private boolean r_R1() {
        if (!(I_p1 <= cursor)) {
            return false;
        }
        return true;
    }

    private boolean r_R2() {
        if (!(I_p2 <= cursor)) {
            return false;
        }
        return true;
    }

    private boolean r_undouble() {
        // (, line 90
        // test, line 91
        int v_1 = limit - cursor;
        // among, line 91
        if (find_among_b(a_2) == 0) {
            return false;
        }
        cursor = limit - v_1;
        // [, line 91
        ket = cursor;
        // next, line 91
        if (cursor <= limit_backward) {
            return false;
        }
        cursor--;
        // ], line 91
        bra = cursor;
        // delete, line 91
        slice_del();
        return true;
    }

    private boolean r_e_ending() {
        // (, line 94
        // unset e_found, line 95
        B_e_found = false;
        // [, line 96
        ket = cursor;
        // literal, line 96
        if (!(eq_s_b("e"))) {
            return false;
        }
        // ], line 96
        bra = cursor;
        // call R1, line 96
        if (!r_R1()) {
            return false;
        }
        // test, line 96
        int v_1 = limit - cursor;
        if (!(out_grouping_b(g_v, 97, 232))) {
            return false;
        }
        cursor = limit - v_1;
        // delete, line 96
        slice_del();
        // set e_found, line 97
        B_e_found = true;
        // call undouble, line 98
        if (!r_undouble()) {
            return false;
        }
        return true;
    }

    private boolean r_en_ending() {
        // (, line 101
        // call R1, line 102
        if (!r_R1()) {
            return false;
        }
        // and, line 102
        int v_1 = limit - cursor;
        if (!(out_grouping_b(g_v, 97, 232))) {
            return false;
        }
        cursor = limit - v_1;
        // not, line 102
        {
            int v_2 = limit - cursor;
            lab0:
            {
                // literal, line 102
                if (!(eq_s_b("gem"))) {
                    break lab0;
                }
                return false;
            }
            cursor = limit - v_2;
        }
        // delete, line 102
        slice_del();
        // call undouble, line 103
        if (!r_undouble()) {
            return false;
        }
        return true;
    }

    private boolean r_standard_suffix() {
        int among_var;
        // (, line 106
        // do, line 107
        int v_1 = limit - cursor;
        lab0:
        {
            // (, line 107
            // [, line 108
            ket = cursor;
            // substring, line 108
            among_var = find_among_b(a_3);
            if (among_var == 0) {
                break lab0;
            }
            // ], line 108
            bra = cursor;
            switch (among_var) {
                case 1:
                    // (, line 110
                    // call R1, line 110
                    if (!r_R1()) {
                        break lab0;
                    }
                    // <-, line 110
                    slice_from("heid");
                    break;
                case 2:
                    // (, line 113
                    // call en_ending, line 113
                    if (!r_en_ending()) {
                        break lab0;
                    }
                    break;
                case 3:
                    // (, line 116
                    // call R1, line 116
                    if (!r_R1()) {
                        break lab0;
                    }
                    if (!(out_grouping_b(g_v_j, 97, 232))) {
                        break lab0;
                    }
                    // delete, line 116
                    slice_del();
                    break;
            }
        }
        cursor = limit - v_1;
        // do, line 120
        int v_2 = limit - cursor;
        // call e_ending, line 120
        r_e_ending();
        cursor = limit - v_2;
        // do, line 122
        int v_3 = limit - cursor;
        lab1:
        {
            // (, line 122
            // [, line 122
            ket = cursor;
            // literal, line 122
            if (!(eq_s_b("heid"))) {
                break lab1;
            }
            // ], line 122
            bra = cursor;
            // call R2, line 122
            if (!r_R2()) {
                break lab1;
            }
            // not, line 122
            {
                int v_4 = limit - cursor;
                lab2:
                {
                    // literal, line 122
                    if (!(eq_s_b("c"))) {
                        break lab2;
                    }
                    break lab1;
                }
                cursor = limit - v_4;
            }
            // delete, line 122
            slice_del();
            // [, line 123
            ket = cursor;
            // literal, line 123
            if (!(eq_s_b("en"))) {
                break lab1;
            }
            // ], line 123
            bra = cursor;
            // call en_ending, line 123
            if (!r_en_ending()) {
                break lab1;
            }
        }
        cursor = limit - v_3;
        // do, line 126
        int v_5 = limit - cursor;
        lab3:
        {
            // (, line 126
            // [, line 127
            ket = cursor;
            // substring, line 127
            among_var = find_among_b(a_4);
            if (among_var == 0) {
                break lab3;
            }
            // ], line 127
            bra = cursor;
            switch (among_var) {
                case 1:
                    // (, line 129
                    // call R2, line 129
                    if (!r_R2()) {
                        break lab3;
                    }
                    // delete, line 129
                    slice_del();
                    // or, line 130
                    lab4:
                    {
                        int v_6 = limit - cursor;
                        lab5:
                        {
                            // (, line 130
                            // [, line 130
                            ket = cursor;
                            // literal, line 130
                            if (!(eq_s_b("ig"))) {
                                break lab5;
                            }
                            // ], line 130
                            bra = cursor;
                            // call R2, line 130
                            if (!r_R2()) {
                                break lab5;
                            }
                            // not, line 130
                            {
                                int v_7 = limit - cursor;
                                lab6:
                                {
                                    // literal, line 130
                                    if (!(eq_s_b("e"))) {
                                        break lab6;
                                    }
                                    break lab5;
                                }
                                cursor = limit - v_7;
                            }
                            // delete, line 130
                            slice_del();
                            break lab4;
                        }
                        cursor = limit - v_6;
                        // call undouble, line 130
                        if (!r_undouble()) {
                            break lab3;
                        }
                    }
                    break;
                case 2:
                    // (, line 133
                    // call R2, line 133
                    if (!r_R2()) {
                        break lab3;
                    }
                    // not, line 133
                {
                    int v_8 = limit - cursor;
                    lab7:
                    {
                        // literal, line 133
                        if (!(eq_s_b("e"))) {
                            break lab7;
                        }
                        break lab3;
                    }
                    cursor = limit - v_8;
                }
                // delete, line 133
                slice_del();
                break;
                case 3:
                    // (, line 136
                    // call R2, line 136
                    if (!r_R2()) {
                        break lab3;
                    }
                    // delete, line 136
                    slice_del();
                    // call e_ending, line 136
                    if (!r_e_ending()) {
                        break lab3;
                    }
                    break;
                case 4:
                    // (, line 139
                    // call R2, line 139
                    if (!r_R2()) {
                        break lab3;
                    }
                    // delete, line 139
                    slice_del();
                    break;
                case 5:
                    // (, line 142
                    // call R2, line 142
                    if (!r_R2()) {
                        break lab3;
                    }
                    // Boolean test e_found, line 142
                    if (!(B_e_found)) {
                        break lab3;
                    }
                    // delete, line 142
                    slice_del();
                    break;
            }
        }
        cursor = limit - v_5;
        // do, line 146
        int v_9 = limit - cursor;
        lab8:
        {
            // (, line 146
            if (!(out_grouping_b(g_v_I, 73, 232))) {
                break lab8;
            }
            // test, line 148
            int v_10 = limit - cursor;
            // (, line 148
            // among, line 149
            if (find_among_b(a_5) == 0) {
                break lab8;
            }
            if (!(out_grouping_b(g_v, 97, 232))) {
                break lab8;
            }
            cursor = limit - v_10;
            // [, line 152
            ket = cursor;
            // next, line 152
            if (cursor <= limit_backward) {
                break lab8;
            }
            cursor--;
            // ], line 152
            bra = cursor;
            // delete, line 152
            slice_del();
        }
        cursor = limit - v_9;
        return true;
    }

    public boolean stem() {
        // (, line 157
        // do, line 159
        int v_1 = cursor;
        // call prelude, line 159
        r_prelude();
        cursor = v_1;
        // do, line 160
        int v_2 = cursor;
        // call mark_regions, line 160
        r_mark_regions();
        cursor = v_2;
        // backwards, line 161
        limit_backward = cursor;
        cursor = limit;
        // do, line 162
        // call standard_suffix, line 162
        r_standard_suffix();
        cursor = limit_backward;
        // do, line 163
        int v_4 = cursor;
        // call postlude, line 163
        r_postlude();
        cursor = v_4;
        return true;
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof DutchStemmer;
    }

    @Override
    public int hashCode() {
        return DutchStemmer.class.getName().hashCode();
    }


}

