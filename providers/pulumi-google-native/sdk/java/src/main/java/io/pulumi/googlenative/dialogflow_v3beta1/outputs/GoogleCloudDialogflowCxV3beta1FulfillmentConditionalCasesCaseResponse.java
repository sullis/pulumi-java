// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dialogflow_v3beta1.outputs.GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCaseCaseContentResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCaseResponse {
    /**
     * A list of case content.
     * 
     */
    private final List<GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCaseCaseContentResponse> caseContent;
    /**
     * The condition to activate and select this case. Empty means the condition is always true. The condition is evaluated against form parameters or session parameters. See the [conditions reference](https://cloud.google.com/dialogflow/cx/docs/reference/condition).
     * 
     */
    private final String condition;

    @OutputCustomType.Constructor({"caseContent","condition"})
    private GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCaseResponse(
        List<GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCaseCaseContentResponse> caseContent,
        String condition) {
        this.caseContent = Objects.requireNonNull(caseContent);
        this.condition = Objects.requireNonNull(condition);
    }

    /**
     * A list of case content.
     * 
    */
    public List<GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCaseCaseContentResponse> getCaseContent() {
        return this.caseContent;
    }
    /**
     * The condition to activate and select this case. Empty means the condition is always true. The condition is evaluated against form parameters or session parameters. See the [conditions reference](https://cloud.google.com/dialogflow/cx/docs/reference/condition).
     * 
    */
    public String getCondition() {
        return this.condition;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCaseResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCaseCaseContentResponse> caseContent;
        private String condition;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCaseResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caseContent = defaults.caseContent;
    	      this.condition = defaults.condition;
        }

        public Builder setCaseContent(List<GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCaseCaseContentResponse> caseContent) {
            this.caseContent = Objects.requireNonNull(caseContent);
            return this;
        }

        public Builder setCondition(String condition) {
            this.condition = Objects.requireNonNull(condition);
            return this;
        }
        public GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCaseResponse build() {
            return new GoogleCloudDialogflowCxV3beta1FulfillmentConditionalCasesCaseResponse(caseContent, condition);
        }
    }
}