// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v3.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dialogflow_v3.inputs.GoogleCloudDialogflowCxV3IntentResponse;
import com.pulumi.googlenative.dialogflow_v3.inputs.GoogleCloudDialogflowCxV3PageResponse;
import com.pulumi.googlenative.dialogflow_v3.inputs.GoogleCloudDialogflowCxV3ResponseMessageTextResponse;
import com.pulumi.googlenative.dialogflow_v3.inputs.GoogleCloudDialogflowCxV3TestRunDifferenceResponse;
import com.pulumi.googlenative.dialogflow_v3.inputs.GoogleRpcStatusResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


/**
 * The output from the virtual agent.
 * 
 */
public final class GoogleCloudDialogflowCxV3ConversationTurnVirtualAgentOutputResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowCxV3ConversationTurnVirtualAgentOutputResponse Empty = new GoogleCloudDialogflowCxV3ConversationTurnVirtualAgentOutputResponse();

    /**
     * The Page on which the utterance was spoken. Only name and displayName will be set.
     * 
     */
    @Import(name="currentPage", required=true)
    private GoogleCloudDialogflowCxV3PageResponse currentPage;

    /**
     * @return The Page on which the utterance was spoken. Only name and displayName will be set.
     * 
     */
    public GoogleCloudDialogflowCxV3PageResponse currentPage() {
        return this.currentPage;
    }

    /**
     * Input only. The diagnostic info output for the turn. Required to calculate the testing coverage.
     * 
     */
    @Import(name="diagnosticInfo", required=true)
    private Map<String,String> diagnosticInfo;

    /**
     * @return Input only. The diagnostic info output for the turn. Required to calculate the testing coverage.
     * 
     */
    public Map<String,String> diagnosticInfo() {
        return this.diagnosticInfo;
    }

    /**
     * If this is part of a result conversation turn, the list of differences between the original run and the replay for this output, if any.
     * 
     */
    @Import(name="differences", required=true)
    private List<GoogleCloudDialogflowCxV3TestRunDifferenceResponse> differences;

    /**
     * @return If this is part of a result conversation turn, the list of differences between the original run and the replay for this output, if any.
     * 
     */
    public List<GoogleCloudDialogflowCxV3TestRunDifferenceResponse> differences() {
        return this.differences;
    }

    /**
     * The session parameters available to the bot at this point.
     * 
     */
    @Import(name="sessionParameters", required=true)
    private Map<String,String> sessionParameters;

    /**
     * @return The session parameters available to the bot at this point.
     * 
     */
    public Map<String,String> sessionParameters() {
        return this.sessionParameters;
    }

    /**
     * Response error from the agent in the test result. If set, other output is empty.
     * 
     */
    @Import(name="status", required=true)
    private GoogleRpcStatusResponse status;

    /**
     * @return Response error from the agent in the test result. If set, other output is empty.
     * 
     */
    public GoogleRpcStatusResponse status() {
        return this.status;
    }

    /**
     * The text responses from the agent for the turn.
     * 
     */
    @Import(name="textResponses", required=true)
    private List<GoogleCloudDialogflowCxV3ResponseMessageTextResponse> textResponses;

    /**
     * @return The text responses from the agent for the turn.
     * 
     */
    public List<GoogleCloudDialogflowCxV3ResponseMessageTextResponse> textResponses() {
        return this.textResponses;
    }

    /**
     * The Intent that triggered the response. Only name and displayName will be set.
     * 
     */
    @Import(name="triggeredIntent", required=true)
    private GoogleCloudDialogflowCxV3IntentResponse triggeredIntent;

    /**
     * @return The Intent that triggered the response. Only name and displayName will be set.
     * 
     */
    public GoogleCloudDialogflowCxV3IntentResponse triggeredIntent() {
        return this.triggeredIntent;
    }

    private GoogleCloudDialogflowCxV3ConversationTurnVirtualAgentOutputResponse() {}

    private GoogleCloudDialogflowCxV3ConversationTurnVirtualAgentOutputResponse(GoogleCloudDialogflowCxV3ConversationTurnVirtualAgentOutputResponse $) {
        this.currentPage = $.currentPage;
        this.diagnosticInfo = $.diagnosticInfo;
        this.differences = $.differences;
        this.sessionParameters = $.sessionParameters;
        this.status = $.status;
        this.textResponses = $.textResponses;
        this.triggeredIntent = $.triggeredIntent;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDialogflowCxV3ConversationTurnVirtualAgentOutputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDialogflowCxV3ConversationTurnVirtualAgentOutputResponse $;

        public Builder() {
            $ = new GoogleCloudDialogflowCxV3ConversationTurnVirtualAgentOutputResponse();
        }

        public Builder(GoogleCloudDialogflowCxV3ConversationTurnVirtualAgentOutputResponse defaults) {
            $ = new GoogleCloudDialogflowCxV3ConversationTurnVirtualAgentOutputResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param currentPage The Page on which the utterance was spoken. Only name and displayName will be set.
         * 
         * @return builder
         * 
         */
        public Builder currentPage(GoogleCloudDialogflowCxV3PageResponse currentPage) {
            $.currentPage = currentPage;
            return this;
        }

        /**
         * @param diagnosticInfo Input only. The diagnostic info output for the turn. Required to calculate the testing coverage.
         * 
         * @return builder
         * 
         */
        public Builder diagnosticInfo(Map<String,String> diagnosticInfo) {
            $.diagnosticInfo = diagnosticInfo;
            return this;
        }

        /**
         * @param differences If this is part of a result conversation turn, the list of differences between the original run and the replay for this output, if any.
         * 
         * @return builder
         * 
         */
        public Builder differences(List<GoogleCloudDialogflowCxV3TestRunDifferenceResponse> differences) {
            $.differences = differences;
            return this;
        }

        /**
         * @param differences If this is part of a result conversation turn, the list of differences between the original run and the replay for this output, if any.
         * 
         * @return builder
         * 
         */
        public Builder differences(GoogleCloudDialogflowCxV3TestRunDifferenceResponse... differences) {
            return differences(List.of(differences));
        }

        /**
         * @param sessionParameters The session parameters available to the bot at this point.
         * 
         * @return builder
         * 
         */
        public Builder sessionParameters(Map<String,String> sessionParameters) {
            $.sessionParameters = sessionParameters;
            return this;
        }

        /**
         * @param status Response error from the agent in the test result. If set, other output is empty.
         * 
         * @return builder
         * 
         */
        public Builder status(GoogleRpcStatusResponse status) {
            $.status = status;
            return this;
        }

        /**
         * @param textResponses The text responses from the agent for the turn.
         * 
         * @return builder
         * 
         */
        public Builder textResponses(List<GoogleCloudDialogflowCxV3ResponseMessageTextResponse> textResponses) {
            $.textResponses = textResponses;
            return this;
        }

        /**
         * @param textResponses The text responses from the agent for the turn.
         * 
         * @return builder
         * 
         */
        public Builder textResponses(GoogleCloudDialogflowCxV3ResponseMessageTextResponse... textResponses) {
            return textResponses(List.of(textResponses));
        }

        /**
         * @param triggeredIntent The Intent that triggered the response. Only name and displayName will be set.
         * 
         * @return builder
         * 
         */
        public Builder triggeredIntent(GoogleCloudDialogflowCxV3IntentResponse triggeredIntent) {
            $.triggeredIntent = triggeredIntent;
            return this;
        }

        public GoogleCloudDialogflowCxV3ConversationTurnVirtualAgentOutputResponse build() {
            $.currentPage = Objects.requireNonNull($.currentPage, "expected parameter 'currentPage' to be non-null");
            $.diagnosticInfo = Objects.requireNonNull($.diagnosticInfo, "expected parameter 'diagnosticInfo' to be non-null");
            $.differences = Objects.requireNonNull($.differences, "expected parameter 'differences' to be non-null");
            $.sessionParameters = Objects.requireNonNull($.sessionParameters, "expected parameter 'sessionParameters' to be non-null");
            $.status = Objects.requireNonNull($.status, "expected parameter 'status' to be non-null");
            $.textResponses = Objects.requireNonNull($.textResponses, "expected parameter 'textResponses' to be non-null");
            $.triggeredIntent = Objects.requireNonNull($.triggeredIntent, "expected parameter 'triggeredIntent' to be non-null");
            return $;
        }
    }

}
