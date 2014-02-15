package com.smartsheet.api;

/*
 * #[license]
 * Smartsheet SDK for Java
 * %%
 * Copyright (C) 2014 Smartsheet
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * %[license]
 */



/**
 * This interface is the entry point of the Smartsheet SDK, it provides convenient methods to get XXXResources instances
 * for accessing different types of resources.
 * 
 * Thread Safety: Implementation of this interface must be thread safe.
 */
//TODO: could put some example code in the documentation.
public interface Smartsheet {
	
	/**
	 * Returns the HomeResources instance that provides access to Home resources.
	 * 
	 * Parameters: None
	 * 
	 * Returns: the resources instance
	 * 
	 * Exceptions: None
	 *
	 * @return the home resources
	 */
	public HomeResources home();

	/**
	 * Returns the WorkspaceResources instance that provides access to Workspace resources.
	 * 
	 * Parameters: None
	 * 
	 * Returns: the resources instance
	 * 
	 * Exceptions: None
	 *
	 * @return the workspace resources
	 */
	public WorkspaceResources workspaces();

	/**
	 * Returns the FolderResources instance that provides access to Folder resources.
	 * 
	 * Parameters: None
	 * 
	 * Returns: the resources instance
	 * 
	 * Exceptions: None
	 *
	 * @return the folder resources
	 */
	public FolderResources folders();

	/**
	 * Returns the TemplateResources instance that provides access to Template resources.
	 * 
	 * Parameters: None
	 * 
	 * Returns: the resources instance
	 * 
	 * Exceptions: None
	 *
	 * @return the template resources
	 */
	public TemplateResources templates();

	/**
	 * Returns the SheetResources instance that provides access to Sheet resources.
	 * 
	 * Parameters: None
	 * 
	 * Returns: the resources instance
	 * 
	 * Exceptions: None
	 *
	 * @return the sheet resources
	 */
	public SheetResources sheets();

	/**
	 * Returns the ColumnResources instance that provides access to Column resources.
	 * 
	 * Parameters: None
	 * 
	 * Returns: the resources instance
	 * 
	 * Exceptions: None
	 *
	 * @return the column resources
	 */
	public ColumnResources columns();

	/**
	 * Returns the RowResources instance that provides access to Row resources.
	 * 
	 * Parameters: None
	 * 
	 * Returns: the resources instance
	 * 
	 * Exceptions: None
	 *
	 * @return the row resources
	 */
	public RowResources rows();

	/**
	 * Returns the AttachmentResources instance that provides access to Attachment resources.
	 * 
	 * Parameters: None
	 * 
	 * Returns: the resources instance
	 * 
	 * Exceptions: None
	 *
	 * @return the attachment resources
	 */
	public AttachmentResources attachments();

	/**
	 * Returns the DiscussionResources instance that provides access to Discussion resources.
	 * 
	 * Parameters: None
	 * 
	 * Returns: the resources instance
	 * 
	 * Exceptions: None
	 *
	 * @return the discussion resources
	 */
	public DiscussionResources discussions();

	/**
	 * Returns the CommentResources instance that provides access to Comment resources.
	 * 
	 * Parameters: None
	 * 
	 * Returns: the resources instance
	 * 
	 * Exceptions: None
	 *
	 * @return the comment resources
	 */
	public CommentResources comments();

	/**
	 * Returns the UserResources instance that provides access to User resources.
	 * 
	 * Parameters: None
	 * 
	 * Returns: the resources instance
	 * 
	 * Exceptions: None
	 *
	 * @return the user resources
	 */
	public UserResources users();

	/**
	 * Returns the SearchResources instance that provides access to searching resources.
	 * 
	 * Parameters: None
	 * 
	 * Returns: the resources instance
	 * 
	 * Exceptions: None
	 *
	 * @return the search resources
	 */
	public SearchResources search();

	/**
	 * Set the email of the user to assume.
	 * 
	 * Parameters: - assumedUser : the email of the user to assume
	 * 
	 * Returns: None
	 * 
	 * Exceptions: - IllegalArgumentException : if any argument is null/empty string
	 *
	 * @param assumedUser the new assumed user
	 */
	public void setAssumedUser(String assumedUser);

	/**
	 * Set the access token to use.
	 * 
	 * Parameters: - accessToken : the access token
	 * 
	 * Returns: None
	 * 
	 * Exceptions: - IllegalArgumentException : if any argument is null/empty string
	 *
	 * @param accessToken the new access token
	 */
	public void setAccessToken(String accessToken);
}