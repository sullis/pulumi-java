// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.connect.outputs;

import io.pulumi.awsnative.connect.enums.ContactFlowState;
import io.pulumi.awsnative.connect.outputs.ContactFlowTag;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetContactFlowResult {
    /**
     * The identifier of the contact flow (ARN).
     * 
     */
    private final @Nullable String contactFlowArn;
    /**
     * The content of the contact flow in JSON format.
     * 
     */
    private final @Nullable String content;
    /**
     * The description of the contact flow.
     * 
     */
    private final @Nullable String description;
    /**
     * The identifier of the Amazon Connect instance (ARN).
     * 
     */
    private final @Nullable String instanceArn;
    /**
     * The name of the contact flow.
     * 
     */
    private final @Nullable String name;
    /**
     * The state of the contact flow.
     * 
     */
    private final @Nullable ContactFlowState state;
    /**
     * One or more tags.
     * 
     */
    private final @Nullable List<ContactFlowTag> tags;

    @OutputCustomType.Constructor({"contactFlowArn","content","description","instanceArn","name","state","tags"})
    private GetContactFlowResult(
        @Nullable String contactFlowArn,
        @Nullable String content,
        @Nullable String description,
        @Nullable String instanceArn,
        @Nullable String name,
        @Nullable ContactFlowState state,
        @Nullable List<ContactFlowTag> tags) {
        this.contactFlowArn = contactFlowArn;
        this.content = content;
        this.description = description;
        this.instanceArn = instanceArn;
        this.name = name;
        this.state = state;
        this.tags = tags;
    }

    /**
     * The identifier of the contact flow (ARN).
     * 
     */
    public Optional<String> getContactFlowArn() {
        return Optional.ofNullable(this.contactFlowArn);
    }
    /**
     * The content of the contact flow in JSON format.
     * 
     */
    public Optional<String> getContent() {
        return Optional.ofNullable(this.content);
    }
    /**
     * The description of the contact flow.
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The identifier of the Amazon Connect instance (ARN).
     * 
     */
    public Optional<String> getInstanceArn() {
        return Optional.ofNullable(this.instanceArn);
    }
    /**
     * The name of the contact flow.
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The state of the contact flow.
     * 
     */
    public Optional<ContactFlowState> getState() {
        return Optional.ofNullable(this.state);
    }
    /**
     * One or more tags.
     * 
     */
    public List<ContactFlowTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetContactFlowResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String contactFlowArn;
        private @Nullable String content;
        private @Nullable String description;
        private @Nullable String instanceArn;
        private @Nullable String name;
        private @Nullable ContactFlowState state;
        private @Nullable List<ContactFlowTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetContactFlowResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contactFlowArn = defaults.contactFlowArn;
    	      this.content = defaults.content;
    	      this.description = defaults.description;
    	      this.instanceArn = defaults.instanceArn;
    	      this.name = defaults.name;
    	      this.state = defaults.state;
    	      this.tags = defaults.tags;
        }

        public Builder setContactFlowArn(@Nullable String contactFlowArn) {
            this.contactFlowArn = contactFlowArn;
            return this;
        }

        public Builder setContent(@Nullable String content) {
            this.content = content;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setInstanceArn(@Nullable String instanceArn) {
            this.instanceArn = instanceArn;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setState(@Nullable ContactFlowState state) {
            this.state = state;
            return this;
        }

        public Builder setTags(@Nullable List<ContactFlowTag> tags) {
            this.tags = tags;
            return this;
        }

        public GetContactFlowResult build() {
            return new GetContactFlowResult(contactFlowArn, content, description, instanceArn, name, state, tags);
        }
    }
}
