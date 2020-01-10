// This file was generated by Mendix Modeler 7.23.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package mxhtmlnp.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the microflows for the MxHTMLNP module
	public static mxhtmlnp.proxies.HTMLDocument ds_htmldocument(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			IMendixObject result = (IMendixObject)Core.execute(context, "MxHTMLNP.ds_htmldocument", params);
			return result == null ? null : mxhtmlnp.proxies.HTMLDocument.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static mxhtmlnp.proxies.SessionData ds_sessiondata(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			IMendixObject result = (IMendixObject)Core.execute(context, "MxHTMLNP.ds_sessiondata", params);
			return result == null ? null : mxhtmlnp.proxies.SessionData.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void ivk_domain_drop(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "MxHTMLNP.ivk_domain_drop", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void ivk_htmldocument_node_add(IContext context, mxhtmlnp.proxies.HTMLDocument _obj_htmldocument)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("obj_htmldocument", _obj_htmldocument == null ? null : _obj_htmldocument.getMendixObject());
			Core.execute(context, "MxHTMLNP.ivk_htmldocument_node_add", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void ivk_htmldocument_node_edit(IContext context, mxhtmlnp.proxies.Node _obj_node)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("obj_node", _obj_node == null ? null : _obj_node.getMendixObject());
			Core.execute(context, "MxHTMLNP.ivk_htmldocument_node_edit", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static java.lang.String ivk_htmldocument_render(IContext context, mxhtmlnp.proxies.HTMLDocument _obj_htmldocument)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("obj_htmldocument", _obj_htmldocument == null ? null : _obj_htmldocument.getMendixObject());
			return (java.lang.String)Core.execute(context, "MxHTMLNP.ivk_htmldocument_render", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void ivk_htmldocument_render_test(IContext context, mxhtmlnp.proxies.HTMLDocument _obj_htmldocument)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("obj_htmldocument", _obj_htmldocument == null ? null : _obj_htmldocument.getMendixObject());
			Core.execute(context, "MxHTMLNP.ivk_htmldocument_render_test", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void ivk_htmldocument_test(IContext context, mxhtmlnp.proxies.SessionData _obj_sessiondata)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("obj_sessiondata", _obj_sessiondata == null ? null : _obj_sessiondata.getMendixObject());
			Core.execute(context, "MxHTMLNP.ivk_htmldocument_test", params);
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
			return (java.lang.String)Core.execute(context, "MxHTMLNP.ivk_htmldocument_test_rest", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void ivk_node_attribute_add(IContext context, mxhtmlnp.proxies.Node _obj_node)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("obj_node", _obj_node == null ? null : _obj_node.getMendixObject());
			Core.execute(context, "MxHTMLNP.ivk_node_attribute_add", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void ivk_node_node_add(IContext context, mxhtmlnp.proxies.Node _obj_node_parent)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("obj_node_parent", _obj_node_parent == null ? null : _obj_node_parent.getMendixObject());
			Core.execute(context, "MxHTMLNP.ivk_node_node_add", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static java.lang.String ivk_node_render(IContext context, java.lang.String _str_html, mxhtmlnp.proxies.Node _obj_node, java.lang.Long _int_lvl)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("str_html", _str_html);
			params.put("obj_node", _obj_node == null ? null : _obj_node.getMendixObject());
			params.put("int_lvl", _int_lvl);
			return (java.lang.String)Core.execute(context, "MxHTMLNP.ivk_node_render", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void ivk_util_addattr(IContext context, java.lang.String _str_k, java.lang.String _str_v, mxhtmlnp.proxies.Node _obj_node)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("str_k", _str_k);
			params.put("str_v", _str_v);
			params.put("obj_node", _obj_node == null ? null : _obj_node.getMendixObject());
			Core.execute(context, "MxHTMLNP.ivk_util_addattr", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static mxhtmlnp.proxies.Node ivk_util_addchildnode(IContext context, java.lang.String _str_name, mxhtmlnp.proxies.Node _obj_node_parent)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("str_name", _str_name);
			params.put("obj_node_parent", _obj_node_parent == null ? null : _obj_node_parent.getMendixObject());
			IMendixObject result = (IMendixObject)Core.execute(context, "MxHTMLNP.ivk_util_addchildnode", params);
			return result == null ? null : mxhtmlnp.proxies.Node.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
}