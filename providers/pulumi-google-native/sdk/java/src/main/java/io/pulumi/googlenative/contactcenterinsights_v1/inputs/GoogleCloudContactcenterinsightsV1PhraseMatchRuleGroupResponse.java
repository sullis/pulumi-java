// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.contactcenterinsights_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.contactcenterinsights_v1.inputs.GoogleCloudContactcenterinsightsV1PhraseMatchRuleResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * A message representing a rule in the phrase matcher.
 * 
 */
public final class GoogleCloudContactcenterinsightsV1PhraseMatchRuleGroupResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudContactcenterinsightsV1PhraseMatchRuleGroupResponse Empty = new GoogleCloudContactcenterinsightsV1PhraseMatchRuleGroupResponse();

    /**
     * A list of phase match rules that are included in this group.
     * 
     */
    @Import(name="phraseMatchRules", required=true)
      private final List<GoogleCloudContactcenterinsightsV1PhraseMatchRuleResponse> phraseMatchRules;

    public List<GoogleCloudContactcenterinsightsV1PhraseMatchRuleResponse> getPhraseMatchRules() {
        return this.phraseMatchRules;
    }

    /**
     * The type of this phrase match rule group.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public GoogleCloudContactcenterinsightsV1PhraseMatchRuleGroupResponse(
        List<GoogleCloudContactcenterinsightsV1PhraseMatchRuleResponse> phraseMatchRules,
        String type) {
        this.phraseMatchRules = Objects.requireNonNull(phraseMatchRules, "expected parameter 'phraseMatchRules' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private GoogleCloudContactcenterinsightsV1PhraseMatchRuleGroupResponse() {
        this.phraseMatchRules = List.of();
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudContactcenterinsightsV1PhraseMatchRuleGroupResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudContactcenterinsightsV1PhraseMatchRuleResponse> phraseMatchRules;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudContactcenterinsightsV1PhraseMatchRuleGroupResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.phraseMatchRules = defaults.phraseMatchRules;
    	      this.type = defaults.type;
        }

        public Builder phraseMatchRules(List<GoogleCloudContactcenterinsightsV1PhraseMatchRuleResponse> phraseMatchRules) {
            this.phraseMatchRules = Objects.requireNonNull(phraseMatchRules);
            return this;
        }
        public Builder phraseMatchRules(GoogleCloudContactcenterinsightsV1PhraseMatchRuleResponse... phraseMatchRules) {
            return phraseMatchRules(List.of(phraseMatchRules));
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GoogleCloudContactcenterinsightsV1PhraseMatchRuleGroupResponse build() {
            return new GoogleCloudContactcenterinsightsV1PhraseMatchRuleGroupResponse(phraseMatchRules, type);
        }
    }
}
