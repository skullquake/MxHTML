// This file was generated by Mendix Modeler 7.23.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package mxhtmlp.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;

public class Microflows
{
	// These are the microflows for the MxHTMLP module
	public static void ivk_domain_drop(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "MxHTMLP.ivk_domain_drop", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void ivk_htmldocument_node_add(IContext context, mxhtmlp.proxies.HTMLDocument _obj_htmldocument)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("obj_htmldocument", _obj_htmldocument == null ? null : _obj_htmldocument.getMendixObject());
			Core.execute(context, "MxHTMLP.ivk_htmldocument_node_add", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void ivk_htmldocument_node_edit(IContext context, mxhtmlp.proxies.Node _obj_node)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("obj_node", _obj_node == null ? null : _obj_node.getMendixObject());
			Core.execute(context, "MxHTMLP.ivk_htmldocument_node_edit", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static java.lang.String ivk_htmldocument_render(IContext context, mxhtmlp.proxies.HTMLDocument _obj_htmldocument)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("obj_htmldocument", _obj_htmldocument == null ? null : _obj_htmldocument.getMendixObject());
			return (java.lang.String)Core.execute(context, "MxHTMLP.ivk_htmldocument_render", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void ivk_htmldocument_render_test(IContext context, mxhtmlp.proxies.HTMLDocument _obj_htmldocument)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("obj_htmldocument", _obj_htmldocument == null ? null : _obj_htmldocument.getMendixObject());
			Core.execute(context, "MxHTMLP.ivk_htmldocument_render_test", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void ivk_htmldocument_test_gui(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "MxHTMLP.ivk_htmldocument_test_gui", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static java.lang.String ivk_htmldocument_test_rest(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			return (java.lang.String)Core.execute(context, "MxHTMLP.ivk_htmldocument_test_rest", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void ivk_node_attribute_add(IContext context, mxhtmlp.proxies.Node _obj_node)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("obj_node", _obj_node == null ? null : _obj_node.getMendixObject());
			Core.execute(context, "MxHTMLP.ivk_node_attribute_add", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void ivk_node_node_add(IContext context, mxhtmlp.proxies.Node _obj_node_parent)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("obj_node_parent", _obj_node_parent == null ? null : _obj_node_parent.getMendixObject());
			Core.execute(context, "MxHTMLP.ivk_node_node_add", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static java.lang.String ivk_node_render(IContext context, java.lang.String _str_html, mxhtmlp.proxies.Node _obj_node, java.lang.Long _int_lvl)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("str_html", _str_html);
			params.put("obj_node", _obj_node == null ? null : _obj_node.getMendixObject());
			params.put("int_lvl", _int_lvl);
			return (java.lang.String)Core.execute(context, "MxHTMLP.ivk_node_render", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
}