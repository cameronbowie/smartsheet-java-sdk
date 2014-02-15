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



import java.util.EnumSet;
import java.util.List;

import com.smartsheet.api.models.Cell;
import com.smartsheet.api.models.CellHistory;
import com.smartsheet.api.models.ObjectInclusion;
import com.smartsheet.api.models.Row;
import com.smartsheet.api.models.RowEmail;
import com.smartsheet.api.models.RowWrapper;

/**
 * This interface provides methods to access Row resources.
 * 
 * Thread Safety: Implementation of this interface must be thread safe.
 */
public interface RowResources {
	
	/**
	 * Get a row.
	 * 
	 * It mirrors to the following Smartsheet REST API method: GET /row/{id}
	 * 
	 * Parameters: - id : the ID - includes : used to specify the optional objects to include, currently DISCUSSIONS and
	 * ATTACHMENTS are supported.
	 * 
	 * Returns: the resource (note that if there is no such resource, this method will throw ResourceNotFoundException
	 * rather than returning null).
	 * 
	 * Exceptions: - InvalidRequestException : if there is any problem with the REST API request -
	 * AuthorizationException : if there is any problem with the REST API authorization(access token) -
	 * ResourceNotFoundException : if the resource can not be found - ServiceUnavailableException : if the REST API
	 * service is not available (possibly due to rate limiting) - SmartsheetRestException : if there is any other REST
	 * API related error occurred during the operation - SmartsheetException : if there is any other error occurred
	 * during the operation
	 *
	 * @param id the id
	 * @param includes the includes
	 * @return the row
	 * @throws SmartsheetException the smartsheet exception
	 */
	public Row getRow(long id, EnumSet<ObjectInclusion> includes) throws SmartsheetException;

	/**
	 * Move a row.
	 * 
	 * It mirrors to the following Smartsheet REST API method: PUT /row/{id}
	 * 
	 * Parameters: - rowWrapper : the RowWrapper with one of the following attributes: * toTop : Moves the row (and
	 * children rows, if any) to the top of the sheet. * toBottom : Moves the row to the bottom of the sheet * parentId
	 * : Moves the row as the first child row of the parent. toBottom=true can also be set to add the row as the last
	 * child of the parent. * siblingId : Moves the row as the next sibling of the row ID provided.
	 * 
	 * Returns: the rows that have been moved by the operaetion
	 * 
	 * Exceptions: - IllegalArgumentException : if any argument is null - InvalidRequestException : if there is any
	 * problem with the REST API request - AuthorizationException : if there is any problem with the REST API
	 * authorization(access token) - ResourceNotFoundException : if the resource can not be found -
	 * ServiceUnavailableException : if the REST API service is not available (possibly due to rate limiting) -
	 * SmartsheetRestException : if there is any other REST API related error occurred during the operation -
	 * SmartsheetException : if there is any other error occurred during the operation
	 *
	 * @param id the id
	 * @param rowWrapper the row wrapper
	 * @return the list
	 * @throws SmartsheetException the smartsheet exception
	 */
	public List<Row> moveRow(long id, RowWrapper rowWrapper) throws SmartsheetException;

	/**
	 * Delete a row.
	 * 
	 * It mirrors to the following Smartsheet REST API method: DELETE /row{id}
	 * 
	 * Parameters: - id : the ID of the row
	 * 
	 * Returns: None
	 * 
	 * Exceptions: - InvalidRequestException : if there is any problem with the REST API request -
	 * AuthorizationException : if there is any problem with the REST API authorization(access token) -
	 * ResourceNotFoundException : if the resource can not be found - ServiceUnavailableException : if the REST API
	 * service is not available (possibly due to rate limiting) - SmartsheetRestException : if there is any other REST
	 * API related error occurred during the operation - SmartsheetException : if there is any other error occurred
	 * during the operation
	 *
	 * @param id the id
	 * @throws SmartsheetException the smartsheet exception
	 */
	public void deleteRow(long id) throws SmartsheetException;

	/**
	 * Send a row via email to the designated recipients.
	 * 
	 * It mirrors to the following Smartsheet REST API method: POST /row/{id}/emails
	 * 
	 * Parameters: - id : the ID of the row - email : the RowEmail
	 * 
	 * Returns: None
	 * 
	 * Exceptions: - IllegalArgumentException : if any argument is null - InvalidRequestException : if there is any
	 * problem with the REST API request - AuthorizationException : if there is any problem with the REST API
	 * authorization(access token) - ServiceUnavailableException : if the REST API service is not available (possibly
	 * due to rate limiting) - SmartsheetRestException : if there is any other REST API related error occurred during
	 * the operation - SmartsheetException : if there is any other error occurred during the operation
	 *
	 * @param id the id
	 * @param email the email
	 * @throws SmartsheetException the smartsheet exception
	 */
	public void sendRow(long id, RowEmail email) throws SmartsheetException;

	/**
	 * Update the values of the Cells in a Row.
	 * 
	 * It mirrors to the following Smartsheet REST API method: PUT /row/{id}/cells
	 * 
	 * Parameters: - id : the row ID - cells : the cells to update (Cells must have the following attributes set: *
	 * columnId * value * strict (optional)
	 * 
	 * Returns: the updated cells (note that if there is no such resource, this method will throw
	 * ResourceNotFoundException rather than returning null).
	 * 
	 * Exceptions: - IllegalArgumentException : if any argument is null - InvalidRequestException : if there is any
	 * problem with the REST API request - AuthorizationException : if there is any problem with the REST API
	 * authorization(access token) - ResourceNotFoundException : if the resource can not be found -
	 * ServiceUnavailableException : if the REST API service is not available (possibly due to rate limiting) -
	 * SmartsheetRestException : if there is any other REST API related error occurred during the operation -
	 * SmartsheetException : if there is any other error occurred during the operation
	 *
	 * @param rowId the row id
	 * @param cells the cells
	 * @return the list
	 * @throws SmartsheetException the smartsheet exception
	 */
	public List<Cell> updateCells(long rowId, List<Cell> cells) throws SmartsheetException;

	/**
	 * Get the cell modification history.
	 * 
	 * It mirrors to the following Smartsheet REST API method: GET /row/{rowId}/column/{columnId}/history
	 * 
	 * Parameters: - rowId : the row ID - columnId : the column ID
	 * 
	 * Returns: the modification history (note that if there is no such resource, this method will throw
	 * ResourceNotFoundException rather than returning null).
	 * 
	 * Exceptions: - InvalidRequestException : if there is any problem with the REST API request -
	 * AuthorizationException : if there is any problem with the REST API authorization(access token) -
	 * ResourceNotFoundException : if the resource can not be found - ServiceUnavailableException : if the REST API
	 * service is not available (possibly due to rate limiting) - SmartsheetRestException : if there is any other REST
	 * API related error occurred during the operation - SmartsheetException : if there is any other error occurred
	 * during the operation
	 *
	 * @param rowId the row id
	 * @param columnId the column id
	 * @return the cell history
	 * @throws SmartsheetException the smartsheet exception
	 */
	public List<CellHistory> getCellHistory(long rowId, long columnId) throws SmartsheetException;

	/**
	 * Return the AssociatedAttachmentResources object that provides access to attachment resources associated with Row
	 * resources.
	 * 
	 * Returns: the AssociatedAttachmentResources object
	 * 
	 * Exceptions: None
	 *
	 * @return the associated attachment resources
	 */
	public AssociatedAttachmentResources attachments();

	/**
	 * Return the AssociatedDiscussionResources object that provides access to discussion resources associated with Row
	 * resources.
	 * 
	 * Returns: the AssociatedDiscussionResources object
	 * 
	 * Exceptions: None
	 *
	 * @return the associated discussion resources
	 */
	public AssociatedDiscussionResources discussions();
}