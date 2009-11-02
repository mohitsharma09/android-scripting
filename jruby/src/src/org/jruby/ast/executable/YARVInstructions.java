/***** BEGIN LICENSE BLOCK *****
 * Version: CPL 1.0/GPL 2.0/LGPL 2.1
 *
 * The contents of this file are subject to the Common Public
 * License Version 1.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of
 * the License at http://www.eclipse.org/legal/cpl-v10.html
 *
 * Software distributed under the License is distributed on an "AS
 * IS" basis, WITHOUT WARRANTY OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * rights and limitations under the License.
 *
 * Copyright (C) 2006 Charles O Nutter <headius@headius.com>
 * Copyright (C) 2007 Ola Bini <ola@ologix.com>
 * 
 * Alternatively, the contents of this file may be used under the terms of
 * either of the GNU General Public License Version 2 or later (the "GPL"),
 * or the GNU Lesser General Public License Version 2.1 or later (the "LGPL"),
 * in which case the provisions of the GPL or the LGPL are applicable instead
 * of those above. If you wish to allow use of your version of this file only
 * under the terms of either the GPL or the LGPL, and not to allow others to
 * use your version of this file under the terms of the CPL, indicate your
 * decision by deleting the provisions above and replace them with the notice
 * and other provisions required by the GPL or the LGPL. If you do not delete
 * the provisions above, a recipient may use your version of this file under
 * the terms of any one of the CPL, the GPL or the LGPL.
 ***** END LICENSE BLOCK *****/
package org.jruby.ast.executable;

import java.util.Map;
import java.util.HashMap;

/**
 * AUTOGENERATED. Change template, not generated file.
 */
public abstract class YARVInstructions {
    public static final int NOP = 0;
    public static final int GETLOCAL = 1;
    public static final int SETLOCAL = 2;
    public static final int GETSPECIAL = 3;
    public static final int SETSPECIAL = 4;
    public static final int GETDYNAMIC = 5;
    public static final int SETDYNAMIC = 6;
    public static final int GETINSTANCEVARIABLE = 7;
    public static final int SETINSTANCEVARIABLE = 8;
    public static final int GETCLASSVARIABLE = 9;
    public static final int SETCLASSVARIABLE = 10;
    public static final int GETCONSTANT = 11;
    public static final int SETCONSTANT = 12;
    public static final int GETGLOBAL = 13;
    public static final int SETGLOBAL = 14;
    public static final int PUTNIL = 15;
    public static final int PUTSELF = 16;
    public static final int PUTUNDEF = 17;
    public static final int PUTOBJECT = 18;
    public static final int PUTSTRING = 19;
    public static final int CONCATSTRINGS = 20;
    public static final int TOSTRING = 21;
    public static final int TOREGEXP = 22;
    public static final int NEWARRAY = 23;
    public static final int DUPARRAY = 24;
    public static final int EXPANDARRAY = 25;
    public static final int CONCATARRAY = 26;
    public static final int SPLATARRAY = 27;
    public static final int CHECKINCLUDEARRAY = 28;
    public static final int NEWHASH = 29;
    public static final int NEWRANGE = 30;
    public static final int PUTNOT = 31;
    public static final int POP = 32;
    public static final int DUP = 33;
    public static final int DUPN = 34;
    public static final int SWAP = 35;
    public static final int REPUT = 36;
    public static final int TOPN = 37;
    public static final int SETN = 38;
    public static final int EMPTSTACK = 39;
    public static final int DEFINEMETHOD = 40;
    public static final int ALIAS = 41;
    public static final int UNDEF = 42;
    public static final int DEFINED = 43;
    public static final int POSTEXE = 44;
    public static final int TRACE = 45;
    public static final int DEFINECLASS = 46;
    public static final int SEND = 47;
    public static final int INVOKESUPER = 48;
    public static final int INVOKEBLOCK = 49;
    public static final int LEAVE = 50;
    public static final int FINISH = 51;
    public static final int THROW = 52;
    public static final int JUMP = 53;
    public static final int BRANCHIF = 54;
    public static final int BRANCHUNLESS = 55;
    public static final int GETINLINECACHE = 56;
    public static final int ONCEINLINECACHE = 57;
    public static final int SETINLINECACHE = 58;
    public static final int OPT_CASE_DISPATCH = 59;
    public static final int OPT_CHECKENV = 60;
    public static final int OPT_PLUS = 61;
    public static final int OPT_MINUS = 62;
    public static final int OPT_MULT = 63;
    public static final int OPT_DIV = 64;
    public static final int OPT_MOD = 65;
    public static final int OPT_EQ = 66;
    public static final int OPT_LT = 67;
    public static final int OPT_LE = 68;
    public static final int OPT_LTLT = 69;
    public static final int OPT_AREF = 70;
    public static final int OPT_ASET = 71;
    public static final int OPT_LENGTH = 72;
    public static final int OPT_SUCC = 73;
    public static final int OPT_REGEXPMATCH1 = 74;
    public static final int OPT_REGEXPMATCH2 = 75;
    public static final int OPT_CALL_NATIVE_COMPILED = 76;
    public static final int BITBLT = 77;
    public static final int ANSWER = 78;
    public static final int GETLOCAL_OP_2 = 79;
    public static final int GETLOCAL_OP_3 = 80;
    public static final int GETLOCAL_OP_4 = 81;
    public static final int SETLOCAL_OP_2 = 82;
    public static final int SETLOCAL_OP_3 = 83;
    public static final int SETLOCAL_OP_4 = 84;
    public static final int GETDYNAMIC_OP__WC__0 = 85;
    public static final int GETDYNAMIC_OP_1_0 = 86;
    public static final int GETDYNAMIC_OP_2_0 = 87;
    public static final int GETDYNAMIC_OP_3_0 = 88;
    public static final int GETDYNAMIC_OP_4_0 = 89;
    public static final int SETDYNAMIC_OP__WC__0 = 90;
    public static final int SETDYNAMIC_OP_1_0 = 91;
    public static final int SETDYNAMIC_OP_2_0 = 92;
    public static final int SETDYNAMIC_OP_3_0 = 93;
    public static final int SETDYNAMIC_OP_4_0 = 94;
    public static final int PUTOBJECT_OP_INT2FIX_0_0_C_ = 95;
    public static final int PUTOBJECT_OP_INT2FIX_0_1_C_ = 96;
    public static final int PUTOBJECT_OP_QTRUE = 97;
    public static final int PUTOBJECT_OP_QFALSE = 98;
    public static final int SEND_OP__WC___WC__QFALSE_0__WC_ = 99;
    public static final int SEND_OP__WC__0_QFALSE_0__WC_ = 100;
    public static final int SEND_OP__WC__1_QFALSE_0__WC_ = 101;
    public static final int SEND_OP__WC__2_QFALSE_0__WC_ = 102;
    public static final int SEND_OP__WC__3_QFALSE_0__WC_ = 103;
    public static final int SEND_OP__WC___WC__QFALSE_0X04__WC_ = 104;
    public static final int SEND_OP__WC__0_QFALSE_0X04__WC_ = 105;
    public static final int SEND_OP__WC__1_QFALSE_0X04__WC_ = 106;
    public static final int SEND_OP__WC__2_QFALSE_0X04__WC_ = 107;
    public static final int SEND_OP__WC__3_QFALSE_0X04__WC_ = 108;
    public static final int SEND_OP__WC__0_QFALSE_0X0C__WC_ = 109;
    public static final int UNIFIED_PUTOBJECT_PUTOBJECT = 110;
    public static final int UNIFIED_PUTOBJECT_PUTSTRING = 111;
    public static final int UNIFIED_PUTOBJECT_SETLOCAL = 112;
    public static final int UNIFIED_PUTOBJECT_SETDYNAMIC = 113;
    public static final int UNIFIED_PUTSTRING_PUTSTRING = 114;
    public static final int UNIFIED_PUTSTRING_PUTOBJECT = 115;
    public static final int UNIFIED_PUTSTRING_SETLOCAL = 116;
    public static final int UNIFIED_PUTSTRING_SETDYNAMIC = 117;
    public static final int UNIFIED_DUP_SETLOCAL = 118;
    public static final int UNIFIED_GETLOCAL_GETLOCAL = 119;
    public static final int UNIFIED_GETLOCAL_PUTOBJECT = 120;

    public static final Map<String, Integer> INSTS_TO_INDEX = new HashMap<String, Integer>();
    static {
        INSTS_TO_INDEX.put("nop",new Integer(0));
        INSTS_TO_INDEX.put("getlocal",new Integer(1));
        INSTS_TO_INDEX.put("setlocal",new Integer(2));
        INSTS_TO_INDEX.put("getspecial",new Integer(3));
        INSTS_TO_INDEX.put("setspecial",new Integer(4));
        INSTS_TO_INDEX.put("getdynamic",new Integer(5));
        INSTS_TO_INDEX.put("setdynamic",new Integer(6));
        INSTS_TO_INDEX.put("getinstancevariable",new Integer(7));
        INSTS_TO_INDEX.put("setinstancevariable",new Integer(8));
        INSTS_TO_INDEX.put("getclassvariable",new Integer(9));
        INSTS_TO_INDEX.put("setclassvariable",new Integer(10));
        INSTS_TO_INDEX.put("getconstant",new Integer(11));
        INSTS_TO_INDEX.put("setconstant",new Integer(12));
        INSTS_TO_INDEX.put("getglobal",new Integer(13));
        INSTS_TO_INDEX.put("setglobal",new Integer(14));
        INSTS_TO_INDEX.put("putnil",new Integer(15));
        INSTS_TO_INDEX.put("putself",new Integer(16));
        INSTS_TO_INDEX.put("putundef",new Integer(17));
        INSTS_TO_INDEX.put("putobject",new Integer(18));
        INSTS_TO_INDEX.put("putstring",new Integer(19));
        INSTS_TO_INDEX.put("concatstrings",new Integer(20));
        INSTS_TO_INDEX.put("tostring",new Integer(21));
        INSTS_TO_INDEX.put("toregexp",new Integer(22));
        INSTS_TO_INDEX.put("newarray",new Integer(23));
        INSTS_TO_INDEX.put("duparray",new Integer(24));
        INSTS_TO_INDEX.put("expandarray",new Integer(25));
        INSTS_TO_INDEX.put("concatarray",new Integer(26));
        INSTS_TO_INDEX.put("splatarray",new Integer(27));
        INSTS_TO_INDEX.put("checkincludearray",new Integer(28));
        INSTS_TO_INDEX.put("newhash",new Integer(29));
        INSTS_TO_INDEX.put("newrange",new Integer(30));
        INSTS_TO_INDEX.put("putnot",new Integer(31));
        INSTS_TO_INDEX.put("pop",new Integer(32));
        INSTS_TO_INDEX.put("dup",new Integer(33));
        INSTS_TO_INDEX.put("dupn",new Integer(34));
        INSTS_TO_INDEX.put("swap",new Integer(35));
        INSTS_TO_INDEX.put("reput",new Integer(36));
        INSTS_TO_INDEX.put("topn",new Integer(37));
        INSTS_TO_INDEX.put("setn",new Integer(38));
        INSTS_TO_INDEX.put("emptstack",new Integer(39));
        INSTS_TO_INDEX.put("definemethod",new Integer(40));
        INSTS_TO_INDEX.put("alias",new Integer(41));
        INSTS_TO_INDEX.put("undef",new Integer(42));
        INSTS_TO_INDEX.put("defined",new Integer(43));
        INSTS_TO_INDEX.put("postexe",new Integer(44));
        INSTS_TO_INDEX.put("trace",new Integer(45));
        INSTS_TO_INDEX.put("defineclass",new Integer(46));
        INSTS_TO_INDEX.put("send",new Integer(47));
        INSTS_TO_INDEX.put("invokesuper",new Integer(48));
        INSTS_TO_INDEX.put("invokeblock",new Integer(49));
        INSTS_TO_INDEX.put("leave",new Integer(50));
        INSTS_TO_INDEX.put("finish",new Integer(51));
        INSTS_TO_INDEX.put("throw",new Integer(52));
        INSTS_TO_INDEX.put("jump",new Integer(53));
        INSTS_TO_INDEX.put("branchif",new Integer(54));
        INSTS_TO_INDEX.put("branchunless",new Integer(55));
        INSTS_TO_INDEX.put("getinlinecache",new Integer(56));
        INSTS_TO_INDEX.put("onceinlinecache",new Integer(57));
        INSTS_TO_INDEX.put("setinlinecache",new Integer(58));
        INSTS_TO_INDEX.put("opt_case_dispatch",new Integer(59));
        INSTS_TO_INDEX.put("opt_checkenv",new Integer(60));
        INSTS_TO_INDEX.put("opt_plus",new Integer(61));
        INSTS_TO_INDEX.put("opt_minus",new Integer(62));
        INSTS_TO_INDEX.put("opt_mult",new Integer(63));
        INSTS_TO_INDEX.put("opt_div",new Integer(64));
        INSTS_TO_INDEX.put("opt_mod",new Integer(65));
        INSTS_TO_INDEX.put("opt_eq",new Integer(66));
        INSTS_TO_INDEX.put("opt_lt",new Integer(67));
        INSTS_TO_INDEX.put("opt_le",new Integer(68));
        INSTS_TO_INDEX.put("opt_ltlt",new Integer(69));
        INSTS_TO_INDEX.put("opt_aref",new Integer(70));
        INSTS_TO_INDEX.put("opt_aset",new Integer(71));
        INSTS_TO_INDEX.put("opt_length",new Integer(72));
        INSTS_TO_INDEX.put("opt_succ",new Integer(73));
        INSTS_TO_INDEX.put("opt_regexpmatch1",new Integer(74));
        INSTS_TO_INDEX.put("opt_regexpmatch2",new Integer(75));
        INSTS_TO_INDEX.put("opt_call_native_compiled",new Integer(76));
        INSTS_TO_INDEX.put("bitblt",new Integer(77));
        INSTS_TO_INDEX.put("answer",new Integer(78));
        INSTS_TO_INDEX.put("getlocal_op_2",new Integer(79));
        INSTS_TO_INDEX.put("getlocal_op_3",new Integer(80));
        INSTS_TO_INDEX.put("getlocal_op_4",new Integer(81));
        INSTS_TO_INDEX.put("setlocal_op_2",new Integer(82));
        INSTS_TO_INDEX.put("setlocal_op_3",new Integer(83));
        INSTS_TO_INDEX.put("setlocal_op_4",new Integer(84));
        INSTS_TO_INDEX.put("getdynamic_op__wc__0",new Integer(85));
        INSTS_TO_INDEX.put("getdynamic_op_1_0",new Integer(86));
        INSTS_TO_INDEX.put("getdynamic_op_2_0",new Integer(87));
        INSTS_TO_INDEX.put("getdynamic_op_3_0",new Integer(88));
        INSTS_TO_INDEX.put("getdynamic_op_4_0",new Integer(89));
        INSTS_TO_INDEX.put("setdynamic_op__wc__0",new Integer(90));
        INSTS_TO_INDEX.put("setdynamic_op_1_0",new Integer(91));
        INSTS_TO_INDEX.put("setdynamic_op_2_0",new Integer(92));
        INSTS_TO_INDEX.put("setdynamic_op_3_0",new Integer(93));
        INSTS_TO_INDEX.put("setdynamic_op_4_0",new Integer(94));
        INSTS_TO_INDEX.put("putobject_op_int2fix_0_0_c_",new Integer(95));
        INSTS_TO_INDEX.put("putobject_op_int2fix_0_1_c_",new Integer(96));
        INSTS_TO_INDEX.put("putobject_op_qtrue",new Integer(97));
        INSTS_TO_INDEX.put("putobject_op_qfalse",new Integer(98));
        INSTS_TO_INDEX.put("send_op__wc___wc__qfalse_0__wc_",new Integer(99));
        INSTS_TO_INDEX.put("send_op__wc__0_qfalse_0__wc_",new Integer(100));
        INSTS_TO_INDEX.put("send_op__wc__1_qfalse_0__wc_",new Integer(101));
        INSTS_TO_INDEX.put("send_op__wc__2_qfalse_0__wc_",new Integer(102));
        INSTS_TO_INDEX.put("send_op__wc__3_qfalse_0__wc_",new Integer(103));
        INSTS_TO_INDEX.put("send_op__wc___wc__qfalse_0x04__wc_",new Integer(104));
        INSTS_TO_INDEX.put("send_op__wc__0_qfalse_0x04__wc_",new Integer(105));
        INSTS_TO_INDEX.put("send_op__wc__1_qfalse_0x04__wc_",new Integer(106));
        INSTS_TO_INDEX.put("send_op__wc__2_qfalse_0x04__wc_",new Integer(107));
        INSTS_TO_INDEX.put("send_op__wc__3_qfalse_0x04__wc_",new Integer(108));
        INSTS_TO_INDEX.put("send_op__wc__0_qfalse_0x0c__wc_",new Integer(109));
        INSTS_TO_INDEX.put("unified_putobject_putobject",new Integer(110));
        INSTS_TO_INDEX.put("unified_putobject_putstring",new Integer(111));
        INSTS_TO_INDEX.put("unified_putobject_setlocal",new Integer(112));
        INSTS_TO_INDEX.put("unified_putobject_setdynamic",new Integer(113));
        INSTS_TO_INDEX.put("unified_putstring_putstring",new Integer(114));
        INSTS_TO_INDEX.put("unified_putstring_putobject",new Integer(115));
        INSTS_TO_INDEX.put("unified_putstring_setlocal",new Integer(116));
        INSTS_TO_INDEX.put("unified_putstring_setdynamic",new Integer(117));
        INSTS_TO_INDEX.put("unified_dup_setlocal",new Integer(118));
        INSTS_TO_INDEX.put("unified_getlocal_getlocal",new Integer(119));
        INSTS_TO_INDEX.put("unified_getlocal_putobject",new Integer(120));
    }
    public static int instruction(String name) {
        return ((Integer)INSTS_TO_INDEX.get(name)).intValue();
    }

    public static final String[] INDEX_TO_NAME = new String[] { 
                      "nop", 
                      "getlocal", 
                      "setlocal", 
                      "getspecial", 
                      "setspecial", 
                      "getdynamic", 
                      "setdynamic", 
                      "getinstancevariable", 
                      "setinstancevariable", 
                      "getclassvariable", 
                      "setclassvariable", 
                      "getconstant", 
                      "setconstant", 
                      "getglobal", 
                      "setglobal", 
                      "putnil", 
                      "putself", 
                      "putundef", 
                      "putobject", 
                      "putstring", 
                      "concatstrings", 
                      "tostring", 
                      "toregexp", 
                      "newarray", 
                      "duparray", 
                      "expandarray", 
                      "concatarray", 
                      "splatarray", 
                      "checkincludearray", 
                      "newhash", 
                      "newrange", 
                      "putnot", 
                      "pop", 
                      "dup", 
                      "dupn", 
                      "swap", 
                      "reput", 
                      "topn", 
                      "setn", 
                      "emptstack", 
                      "definemethod", 
                      "alias", 
                      "undef", 
                      "defined", 
                      "postexe", 
                      "trace", 
                      "defineclass", 
                      "send", 
                      "invokesuper", 
                      "invokeblock", 
                      "leave", 
                      "finish", 
                      "throw", 
                      "jump", 
                      "branchif", 
                      "branchunless", 
                      "getinlinecache", 
                      "onceinlinecache", 
                      "setinlinecache", 
                      "opt_case_dispatch", 
                      "opt_checkenv", 
                      "opt_plus", 
                      "opt_minus", 
                      "opt_mult", 
                      "opt_div", 
                      "opt_mod", 
                      "opt_eq", 
                      "opt_lt", 
                      "opt_le", 
                      "opt_ltlt", 
                      "opt_aref", 
                      "opt_aset", 
                      "opt_length", 
                      "opt_succ", 
                      "opt_regexpmatch1", 
                      "opt_regexpmatch2", 
                      "opt_call_native_compiled", 
                      "bitblt", 
                      "answer", 
                      "getlocal_op_2", 
                      "getlocal_op_3", 
                      "getlocal_op_4", 
                      "setlocal_op_2", 
                      "setlocal_op_3", 
                      "setlocal_op_4", 
                      "getdynamic_op__wc__0", 
                      "getdynamic_op_1_0", 
                      "getdynamic_op_2_0", 
                      "getdynamic_op_3_0", 
                      "getdynamic_op_4_0", 
                      "setdynamic_op__wc__0", 
                      "setdynamic_op_1_0", 
                      "setdynamic_op_2_0", 
                      "setdynamic_op_3_0", 
                      "setdynamic_op_4_0", 
                      "putobject_op_int2fix_0_0_c_", 
                      "putobject_op_int2fix_0_1_c_", 
                      "putobject_op_qtrue", 
                      "putobject_op_qfalse", 
                      "send_op__wc___wc__qfalse_0__wc_", 
                      "send_op__wc__0_qfalse_0__wc_", 
                      "send_op__wc__1_qfalse_0__wc_", 
                      "send_op__wc__2_qfalse_0__wc_", 
                      "send_op__wc__3_qfalse_0__wc_", 
                      "send_op__wc___wc__qfalse_0x04__wc_", 
                      "send_op__wc__0_qfalse_0x04__wc_", 
                      "send_op__wc__1_qfalse_0x04__wc_", 
                      "send_op__wc__2_qfalse_0x04__wc_", 
                      "send_op__wc__3_qfalse_0x04__wc_", 
                      "send_op__wc__0_qfalse_0x0c__wc_", 
                      "unified_putobject_putobject", 
                      "unified_putobject_putstring", 
                      "unified_putobject_setlocal", 
                      "unified_putobject_setdynamic", 
                      "unified_putstring_putstring", 
                      "unified_putstring_putobject", 
                      "unified_putstring_setlocal", 
                      "unified_putstring_setdynamic", 
                      "unified_dup_setlocal", 
                      "unified_getlocal_getlocal", 
                      "unified_getlocal_putobject"};

    public static String name(int index) {
        return INDEX_TO_NAME[index];
    }

    public static final int ARGS_SPLAT_FLAG = 2;
    public static final int ARGS_BLOCKARG_FLAG = 4;
    public static final int FCALL_FLAG = 8;
    public static final int VCALL_FLAG = 16;
    public static final int TAILCALL_FLAG = 32;
    public static final int TAILRECURSION_FLAG = 64;
    public static final int SUPER = 128;
}
