/*
 * Copyright (c) 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

// Tie class generated by rmic, do not edit.
// Contents subject to change without notice.

package org.omg.stub.com.sun.ts.tests.rmiiiop.ee.standalone;

import com.sun.ts.tests.rmiiiop.ee.marshaltests.Graph;
import com.sun.ts.tests.rmiiiop.ee.marshaltests.IDLStruct;
import com.sun.ts.tests.rmiiiop.ee.marshaltests.Multi;
import com.sun.ts.tests.rmiiiop.ee.marshaltests.UserException;
import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;
import javax.rmi.CORBA.Tie;
import javax.rmi.CORBA.Util;
import javax.rmi.PortableRemoteObject;
import org.omg.CORBA.BAD_OPERATION;
import org.omg.CORBA.ORB;
import org.omg.CORBA.SystemException;
import org.omg.CORBA.portable.InputStream;
import org.omg.CORBA.portable.OutputStream;
import org.omg.CORBA.portable.ResponseHandler;
import org.omg.CORBA.portable.UnknownException;
import org.omg.PortableServer.Servant;

import com.sun.ts.tests.rmiiiop.ee.standalone.*;

public class _RMIIIOPServer_Tie extends Servant implements Tie {

  private RMIIIOPServer target = null;

  private static final String[] _type_ids = {
      "RMI:com.sun.ts.tests.rmiiiop.ee.standalone.RMIIIOPTests:0000000000000000" };

  public void setTarget(Remote target) {
    this.target = (RMIIIOPServer) target;
  }

  public Remote getTarget() {
    return target;
  }

  public org.omg.CORBA.Object thisObject() {
    return _this_object();
  }

  public void deactivate() {
    try {
      _poa().deactivate_object(_poa().servant_to_id(this));
    } catch (org.omg.PortableServer.POAPackage.WrongPolicy exception) {

    } catch (org.omg.PortableServer.POAPackage.ObjectNotActive exception) {

    } catch (org.omg.PortableServer.POAPackage.ServantNotActive exception) {

    }
  }

  public ORB orb() {
    return _orb();
  }

  public void orb(ORB orb) {
    try {
      ((org.omg.CORBA_2_3.ORB) orb).set_delegate(this);
    } catch (ClassCastException e) {
      throw new org.omg.CORBA.BAD_PARAM(
          "POA Servant requires an instance of org.omg.CORBA_2_3.ORB");
    }
  }

  public String[] _all_interfaces(org.omg.PortableServer.POA poa,
      byte[] objectId) {
    return _type_ids;
  }

  public OutputStream _invoke(String method, InputStream _in,
      ResponseHandler reply) throws SystemException {
    try {
      org.omg.CORBA_2_3.portable.InputStream in = (org.omg.CORBA_2_3.portable.InputStream) _in;
      switch (method.length()) {
      case 10:
        if (method.equals("pass_a_int")) {
          int arg0 = in.read_long();
          int arg1 = in.read_long();
          int result = target.pass_a_int(arg0, arg1);
          OutputStream out = reply.createReply();
          out.write_long(result);
          return out;
        }
      case 11:
        if (method.equals("pass_a_byte")) {
          int arg0 = in.read_long();
          byte arg1 = in.read_octet();
          byte result = target.pass_a_byte(arg0, arg1);
          OutputStream out = reply.createReply();
          out.write_octet(result);
          return out;
        } else if (method.equals("pass_a_char")) {
          int arg0 = in.read_long();
          char arg1 = in.read_wchar();
          char result = target.pass_a_char(arg0, arg1);
          OutputStream out = reply.createReply();
          out.write_wchar(result);
          return out;
        } else if (method.equals("pass_a_long")) {
          int arg0 = in.read_long();
          long arg1 = in.read_longlong();
          long result = target.pass_a_long(arg0, arg1);
          OutputStream out = reply.createReply();
          out.write_longlong(result);
          return out;
        }
      case 12:
        if (method.equals("pass_a_short")) {
          int arg0 = in.read_long();
          short arg1 = in.read_short();
          short result = target.pass_a_short(arg0, arg1);
          OutputStream out = reply.createReply();
          out.write_short(result);
          return out;
        } else if (method.equals("pass_a_float")) {
          int arg0 = in.read_long();
          float arg1 = in.read_float();
          float result = target.pass_a_float(arg0, arg1);
          OutputStream out = reply.createReply();
          out.write_float(result);
          return out;
        }
      case 13:
        if (method.equals("pass_a_double")) {
          int arg0 = in.read_long();
          double arg1 = in.read_double();
          double result = target.pass_a_double(arg0, arg1);
          OutputStream out = reply.createReply();
          out.write_double(result);
          return out;
        }
      case 14:
        if (method.equals("pass_a_boolean")) {
          int arg0 = in.read_long();
          boolean arg1 = in.read_boolean();
          boolean result = target.pass_a_boolean(arg0, arg1);
          OutputStream out = reply.createReply();
          out.write_boolean(result);
          return out;
        }
      case 15:
        if (method.equals("pass_any_object")) {
          Object arg0 = Util.readAny(in);
          int result = target.pass_any_object(arg0);
          OutputStream out = reply.createReply();
          out.write_long(result);
          return out;
        }
      case 16:
        if (method.equals("pass_a_int_array")) {
          int[] arg0 = (int[]) in.read_value(int[].class);
          int[] result = target.pass_a_int_array(arg0);
          org.omg.CORBA_2_3.portable.OutputStream out = (org.omg.CORBA_2_3.portable.OutputStream) reply
              .createReply();
          out.write_value(cast_array(result), int[].class);
          return out;
        } else if (method.equals("pass_verify_stub")) {
          CallBackInterface arg0 = (CallBackInterface) PortableRemoteObject
              .narrow(in.read_Object(), CallBackInterface.class);
          int result = target.pass_verify_stub(arg0);
          OutputStream out = reply.createReply();
          out.write_long(result);
          return out;
        }
      case 17:
        if (method.equals("pass_a_byte_array")) {
          byte[] arg0 = (byte[]) in.read_value(byte[].class);
          byte[] result = target.pass_a_byte_array(arg0);
          org.omg.CORBA_2_3.portable.OutputStream out = (org.omg.CORBA_2_3.portable.OutputStream) reply
              .createReply();
          out.write_value(cast_array(result), byte[].class);
          return out;
        } else if (method.equals("pass_a_char_array")) {
          char[] arg0 = (char[]) in.read_value(char[].class);
          char[] result = target.pass_a_char_array(arg0);
          org.omg.CORBA_2_3.portable.OutputStream out = (org.omg.CORBA_2_3.portable.OutputStream) reply
              .createReply();
          out.write_value(cast_array(result), char[].class);
          return out;
        } else if (method.equals("pass_a_long_array")) {
          long[] arg0 = (long[]) in.read_value(long[].class);
          long[] result = target.pass_a_long_array(arg0);
          org.omg.CORBA_2_3.portable.OutputStream out = (org.omg.CORBA_2_3.portable.OutputStream) reply
              .createReply();
          out.write_value(cast_array(result), long[].class);
          return out;
        } else if (method.equals("return_any_object")) {
          Object result = target.return_any_object();
          OutputStream out = reply.createReply();
          Util.writeAny(out, result);
          return out;
        }
      case 18:
        if (method.equals("pass_a_short_array")) {
          short[] arg0 = (short[]) in.read_value(short[].class);
          short[] result = target.pass_a_short_array(arg0);
          org.omg.CORBA_2_3.portable.OutputStream out = (org.omg.CORBA_2_3.portable.OutputStream) reply
              .createReply();
          out.write_value(cast_array(result), short[].class);
          return out;
        } else if (method.equals("pass_a_float_array")) {
          float[] arg0 = (float[]) in.read_value(float[].class);
          float[] result = target.pass_a_float_array(arg0);
          org.omg.CORBA_2_3.portable.OutputStream out = (org.omg.CORBA_2_3.portable.OutputStream) reply
              .createReply();
          out.write_value(cast_array(result), float[].class);
          return out;
        } else if (method.equals("pass_a_date_object")) {
          Date arg0 = (Date) in.read_value(Date.class);
          int result = target.pass_a_date_object(arg0);
          OutputStream out = reply.createReply();
          out.write_long(result);
          return out;
        } else if (method.equals("return_verify_stub")) {
          CallBackInterface result = target.return_verify_stub();
          OutputStream out = reply.createReply();
          Util.writeRemoteObject(out, result);
          return out;
        }
      case 19:
        if (method.equals("pass_a_double_array")) {
          double[] arg0 = (double[]) in.read_value(double[].class);
          double[] result = target.pass_a_double_array(arg0);
          org.omg.CORBA_2_3.portable.OutputStream out = (org.omg.CORBA_2_3.portable.OutputStream) reply
              .createReply();
          out.write_value(cast_array(result), double[].class);
          return out;
        }
      case 20:
        if (method.equals("pass_a_boolean_array")) {
          boolean[] arg0 = (boolean[]) in.read_value(boolean[].class);
          boolean[] result = target.pass_a_boolean_array(arg0);
          org.omg.CORBA_2_3.portable.OutputStream out = (org.omg.CORBA_2_3.portable.OutputStream) reply
              .createReply();
          out.write_value(cast_array(result), boolean[].class);
          return out;
        } else if (method.equals("return_a_date_object")) {
          Date result = target.return_a_date_object();
          org.omg.CORBA_2_3.portable.OutputStream out = (org.omg.CORBA_2_3.portable.OutputStream) reply
              .createReply();
          out.write_value(result, Date.class);
          return out;
        }
      case 21:
        if (method.equals("pass_any_object_array")) {
          Object[] arg0 = (Object[]) in.read_value(Object[].class);
          int result = target.pass_any_object_array(arg0);
          OutputStream out = reply.createReply();
          out.write_long(result);
          return out;
        }
      case 22:
        if (method.equals("throw_a_user_exception")) {
          try {
            target.throw_a_user_exception();
          } catch (UserException ex) {
            String id = "IDL:com/sun/ts/tests/rmiiiop/ee/marshaltests/UserEx:1.0";
            org.omg.CORBA_2_3.portable.OutputStream out = (org.omg.CORBA_2_3.portable.OutputStream) reply
                .createExceptionReply();
            out.write_string(id);
            out.write_value(ex, UserException.class);
            return out;
          }
          OutputStream out = reply.createReply();
          return out;
        }
      case 23:
        if (method.equals("return_any_object_array")) {
          Object[] result = target.return_any_object_array();
          org.omg.CORBA_2_3.portable.OutputStream out = (org.omg.CORBA_2_3.portable.OutputStream) reply
              .createReply();
          out.write_value(cast_array(result), Object[].class);
          return out;
        } else if (method.equals("pass_a_remote_interface")) {
          CallBackInterface arg0 = (CallBackInterface) PortableRemoteObject
              .narrow(in.read_Object(), CallBackInterface.class);
          int result = target.pass_a_remote_interface(arg0);
          OutputStream out = reply.createReply();
          out.write_long(result);
          return out;
        } else if (method.equals("pass_a_graph_of_objects")) {
          Graph arg0 = (Graph) in.read_value(Graph.class);
          int result = target.pass_a_graph_of_objects(arg0);
          OutputStream out = reply.createReply();
          out.write_long(result);
          return out;
        } else if (method.equals("shutdown_rmiiiop_server")) {
          target.shutdown_rmiiiop_server();
          OutputStream out = reply.createReply();
          return out;
        }
      case 24:
        if (method.equals("pass_a_date_object_array")) {
          Date[] arg0 = (Date[]) in.read_value(Date[].class);
          int result = target.pass_a_date_object_array(arg0);
          OutputStream out = reply.createReply();
          out.write_long(result);
          return out;
        }
      case 25:
        if (method.equals("return_a_remote_interface")) {
          CallBackInterface result = target.return_a_remote_interface();
          OutputStream out = reply.createReply();
          Util.writeRemoteObject(out, result);
          return out;
        } else if (method.equals("return_a_graph_of_objects")) {
          Graph result = target.return_a_graph_of_objects();
          org.omg.CORBA_2_3.portable.OutputStream out = (org.omg.CORBA_2_3.portable.OutputStream) reply
              .createReply();
          out.write_value(result, Graph.class);
          return out;
        } else if (method.equals("pass_return_object3_array")) {
          Object[][][] arg0 = (Object[][][]) in.read_value(Object[][][].class);
          Object[][][] result = target.pass_return_object3_array(arg0);
          org.omg.CORBA_2_3.portable.OutputStream out = (org.omg.CORBA_2_3.portable.OutputStream) reply
              .createReply();
          out.write_value(cast_array(result), Object[][][].class);
          return out;
        }
      case 26:
        if (method.equals("return_a_date_object_array")) {
          Date[] result = target.return_a_date_object_array();
          org.omg.CORBA_2_3.portable.OutputStream out = (org.omg.CORBA_2_3.portable.OutputStream) reply
              .createReply();
          out.write_value(cast_array(result), Date[].class);
          return out;
        }
      case 27:
        if (method.equals("pass_array_of_graph_objects")) {
          Graph[] arg0 = (Graph[]) in.read_value(Graph[].class);
          int result = target.pass_array_of_graph_objects(arg0);
          OutputStream out = reply.createReply();
          out.write_long(result);
          return out;
        }
      case 28:
        if (method.equals("pass_return_multiclass_types")) {
          Multi arg0 = (Multi) in.read_value(Multi.class);
          Multi result = target.pass_return_multiclass_types(arg0);
          org.omg.CORBA_2_3.portable.OutputStream out = (org.omg.CORBA_2_3.portable.OutputStream) reply
              .createReply();
          out.write_value(result, Multi.class);
          return out;
        }
      case 29:
        if (method.equals("return_array_of_graph_objects")) {
          Graph[] result = target.return_array_of_graph_objects();
          org.omg.CORBA_2_3.portable.OutputStream out = (org.omg.CORBA_2_3.portable.OutputStream) reply
              .createReply();
          out.write_value(cast_array(result), Graph[].class);
          return out;
        }
      case 31:
        if (method.equals("pass_array_of_remote_interfaces")) {
          CallBackInterface[] arg0 = (CallBackInterface[]) in
              .read_value(CallBackInterface[].class);
          int result = target.pass_array_of_remote_interfaces(arg0);
          OutputStream out = reply.createReply();
          out.write_long(result);
          return out;
        }
      case 33:
        if (method.equals("return_array_of_remote_interfaces")) {
          CallBackInterface[] result = target
              .return_array_of_remote_interfaces();
          org.omg.CORBA_2_3.portable.OutputStream out = (org.omg.CORBA_2_3.portable.OutputStream) reply
              .createReply();
          out.write_value(cast_array(result), CallBackInterface[].class);
          return out;
        }
      case 97:
        if (method.equals(
            "pass_return_idl_entity_types__org_omg_boxedIDL_com_sun_ts_tests_rmiiiop_ee_marshaltests_IDLStruct")) {
          IDLStruct arg0 = (IDLStruct) in.read_value(IDLStruct.class);
          IDLStruct result = target.pass_return_idl_entity_types(arg0);
          org.omg.CORBA_2_3.portable.OutputStream out = (org.omg.CORBA_2_3.portable.OutputStream) reply
              .createReply();
          out.write_value(result, IDLStruct.class);
          return out;
        }
      case 119:
        if (method.equals(
            "pass_return_idl_entity_types__org_omg_boxedRMI_org_omg_boxedIDL_com_sun_ts_tests_rmiiiop_ee_marshaltests_seq1_IDLStruct")) {
          IDLStruct[] arg0 = (IDLStruct[]) in.read_value(IDLStruct[].class);
          IDLStruct[] result = target.pass_return_idl_entity_types(arg0);
          org.omg.CORBA_2_3.portable.OutputStream out = (org.omg.CORBA_2_3.portable.OutputStream) reply
              .createReply();
          out.write_value(cast_array(result), IDLStruct[].class);
          return out;
        }
      }
      throw new BAD_OPERATION();
    } catch (SystemException ex) {
      throw ex;
    } catch (Throwable ex) {
      throw new UnknownException(ex);
    }
  }

  // This method is required as a work-around for
  // a bug in the JDK 1.1.6 verifier.

  private Serializable cast_array(Object obj) {
    return (Serializable) obj;
  }
}