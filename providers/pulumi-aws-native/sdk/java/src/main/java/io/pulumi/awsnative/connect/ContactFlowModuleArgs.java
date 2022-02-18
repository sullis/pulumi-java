// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.connect;

import io.pulumi.awsnative.connect.enums.ContactFlowModuleState;
import io.pulumi.awsnative.connect.inputs.ContactFlowModuleTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ContactFlowModuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContactFlowModuleArgs Empty = new ContactFlowModuleArgs();

    /**
     * The content of the contact flow module in JSON format.
     * 
     */
    @InputImport(name="content", required=true)
    private final Input<String> content;

    public Input<String> getContent() {
        return this.content;
    }

    /**
     * The description of the contact flow module.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The identifier of the Amazon Connect instance (ARN).
     * 
     */
    @InputImport(name="instanceArn", required=true)
    private final Input<String> instanceArn;

    public Input<String> getInstanceArn() {
        return this.instanceArn;
    }

    /**
     * The name of the contact flow module.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The state of the contact flow module.
     * 
     */
    @InputImport(name="state")
    private final @Nullable Input<ContactFlowModuleState> state;

    public Input<ContactFlowModuleState> getState() {
        return this.state == null ? Input.empty() : this.state;
    }

    /**
     * One or more tags.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<List<ContactFlowModuleTagArgs>> tags;

    public Input<List<ContactFlowModuleTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public ContactFlowModuleArgs(
        Input<String> content,
        @Nullable Input<String> description,
        Input<String> instanceArn,
        @Nullable Input<String> name,
        @Nullable Input<ContactFlowModuleState> state,
        @Nullable Input<List<ContactFlowModuleTagArgs>> tags) {
        this.content = Objects.requireNonNull(content, "expected parameter 'content' to be non-null");
        this.description = description;
        this.instanceArn = Objects.requireNonNull(instanceArn, "expected parameter 'instanceArn' to be non-null");
        this.name = name;
        this.state = state;
        this.tags = tags;
    }

    private ContactFlowModuleArgs() {
        this.content = Input.empty();
        this.description = Input.empty();
        this.instanceArn = Input.empty();
        this.name = Input.empty();
        this.state = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContactFlowModuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> content;
        private @Nullable Input<String> description;
        private Input<String> instanceArn;
        private @Nullable Input<String> name;
        private @Nullable Input<ContactFlowModuleState> state;
        private @Nullable Input<List<ContactFlowModuleTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ContactFlowModuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.description = defaults.description;
    	      this.instanceArn = defaults.instanceArn;
    	      this.name = defaults.name;
    	      this.state = defaults.state;
    	      this.tags = defaults.tags;
        }

        public Builder setContent(Input<String> content) {
            this.content = Objects.requireNonNull(content);
            return this;
        }

        public Builder setContent(String content) {
            this.content = Input.of(Objects.requireNonNull(content));
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setInstanceArn(Input<String> instanceArn) {
            this.instanceArn = Objects.requireNonNull(instanceArn);
            return this;
        }

        public Builder setInstanceArn(String instanceArn) {
            this.instanceArn = Input.of(Objects.requireNonNull(instanceArn));
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setState(@Nullable Input<ContactFlowModuleState> state) {
            this.state = state;
            return this;
        }

        public Builder setState(@Nullable ContactFlowModuleState state) {
            this.state = Input.ofNullable(state);
            return this;
        }

        public Builder setTags(@Nullable Input<List<ContactFlowModuleTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<ContactFlowModuleTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public ContactFlowModuleArgs build() {
            return new ContactFlowModuleArgs(content, description, instanceArn, name, state, tags);
        }
    }
}
