// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ssmincidents.outputs;

import io.pulumi.awsnative.ssmincidents.outputs.ResponsePlanAction;
import io.pulumi.awsnative.ssmincidents.outputs.ResponsePlanChatChannel;
import io.pulumi.awsnative.ssmincidents.outputs.ResponsePlanIncidentTemplate;
import io.pulumi.awsnative.ssmincidents.outputs.ResponsePlanTag;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetResponsePlanResult {
    /**
     * The list of actions.
     * 
     */
    private final @Nullable List<ResponsePlanAction> actions;
    /**
     * The ARN of the response plan.
     * 
     */
    private final @Nullable String arn;
    private final @Nullable ResponsePlanChatChannel chatChannel;
    /**
     * The display name of the response plan.
     * 
     */
    private final @Nullable String displayName;
    /**
     * The list of engagements to use.
     * 
     */
    private final @Nullable List<String> engagements;
    private final @Nullable ResponsePlanIncidentTemplate incidentTemplate;
    /**
     * The tags to apply to the response plan.
     * 
     */
    private final @Nullable List<ResponsePlanTag> tags;

    @CustomType.Constructor
    private GetResponsePlanResult(
        @CustomType.Parameter("actions") @Nullable List<ResponsePlanAction> actions,
        @CustomType.Parameter("arn") @Nullable String arn,
        @CustomType.Parameter("chatChannel") @Nullable ResponsePlanChatChannel chatChannel,
        @CustomType.Parameter("displayName") @Nullable String displayName,
        @CustomType.Parameter("engagements") @Nullable List<String> engagements,
        @CustomType.Parameter("incidentTemplate") @Nullable ResponsePlanIncidentTemplate incidentTemplate,
        @CustomType.Parameter("tags") @Nullable List<ResponsePlanTag> tags) {
        this.actions = actions;
        this.arn = arn;
        this.chatChannel = chatChannel;
        this.displayName = displayName;
        this.engagements = engagements;
        this.incidentTemplate = incidentTemplate;
        this.tags = tags;
    }

    /**
     * The list of actions.
     * 
    */
    public List<ResponsePlanAction> actions() {
        return this.actions == null ? List.of() : this.actions;
    }
    /**
     * The ARN of the response plan.
     * 
    */
    public Optional<String> arn() {
        return Optional.ofNullable(this.arn);
    }
    public Optional<ResponsePlanChatChannel> chatChannel() {
        return Optional.ofNullable(this.chatChannel);
    }
    /**
     * The display name of the response plan.
     * 
    */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * The list of engagements to use.
     * 
    */
    public List<String> engagements() {
        return this.engagements == null ? List.of() : this.engagements;
    }
    public Optional<ResponsePlanIncidentTemplate> incidentTemplate() {
        return Optional.ofNullable(this.incidentTemplate);
    }
    /**
     * The tags to apply to the response plan.
     * 
    */
    public List<ResponsePlanTag> tags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResponsePlanResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ResponsePlanAction> actions;
        private @Nullable String arn;
        private @Nullable ResponsePlanChatChannel chatChannel;
        private @Nullable String displayName;
        private @Nullable List<String> engagements;
        private @Nullable ResponsePlanIncidentTemplate incidentTemplate;
        private @Nullable List<ResponsePlanTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResponsePlanResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.arn = defaults.arn;
    	      this.chatChannel = defaults.chatChannel;
    	      this.displayName = defaults.displayName;
    	      this.engagements = defaults.engagements;
    	      this.incidentTemplate = defaults.incidentTemplate;
    	      this.tags = defaults.tags;
        }

        public Builder actions(@Nullable List<ResponsePlanAction> actions) {
            this.actions = actions;
            return this;
        }
        public Builder actions(ResponsePlanAction... actions) {
            return actions(List.of(actions));
        }
        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }
        public Builder chatChannel(@Nullable ResponsePlanChatChannel chatChannel) {
            this.chatChannel = chatChannel;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder engagements(@Nullable List<String> engagements) {
            this.engagements = engagements;
            return this;
        }
        public Builder engagements(String... engagements) {
            return engagements(List.of(engagements));
        }
        public Builder incidentTemplate(@Nullable ResponsePlanIncidentTemplate incidentTemplate) {
            this.incidentTemplate = incidentTemplate;
            return this;
        }
        public Builder tags(@Nullable List<ResponsePlanTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(ResponsePlanTag... tags) {
            return tags(List.of(tags));
        }        public GetResponsePlanResult build() {
            return new GetResponsePlanResult(actions, arn, chatChannel, displayName, engagements, incidentTemplate, tags);
        }
    }
}
