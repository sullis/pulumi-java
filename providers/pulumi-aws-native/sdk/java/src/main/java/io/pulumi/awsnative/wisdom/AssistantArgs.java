// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wisdom;

import io.pulumi.awsnative.wisdom.enums.AssistantType;
import io.pulumi.awsnative.wisdom.inputs.AssistantServerSideEncryptionConfigurationArgs;
import io.pulumi.awsnative.wisdom.inputs.AssistantTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AssistantArgs extends io.pulumi.resources.ResourceArgs {

    public static final AssistantArgs Empty = new AssistantArgs();

    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="serverSideEncryptionConfiguration")
    private final @Nullable Input<AssistantServerSideEncryptionConfigurationArgs> serverSideEncryptionConfiguration;

    public Input<AssistantServerSideEncryptionConfigurationArgs> getServerSideEncryptionConfiguration() {
        return this.serverSideEncryptionConfiguration == null ? Input.empty() : this.serverSideEncryptionConfiguration;
    }

    @InputImport(name="tags")
    private final @Nullable Input<List<AssistantTagArgs>> tags;

    public Input<List<AssistantTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    @InputImport(name="type", required=true)
    private final Input<AssistantType> type;

    public Input<AssistantType> getType() {
        return this.type;
    }

    public AssistantArgs(
        @Nullable Input<String> description,
        @Nullable Input<String> name,
        @Nullable Input<AssistantServerSideEncryptionConfigurationArgs> serverSideEncryptionConfiguration,
        @Nullable Input<List<AssistantTagArgs>> tags,
        Input<AssistantType> type) {
        this.description = description;
        this.name = name;
        this.serverSideEncryptionConfiguration = serverSideEncryptionConfiguration;
        this.tags = tags;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private AssistantArgs() {
        this.description = Input.empty();
        this.name = Input.empty();
        this.serverSideEncryptionConfiguration = Input.empty();
        this.tags = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssistantArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<String> name;
        private @Nullable Input<AssistantServerSideEncryptionConfigurationArgs> serverSideEncryptionConfiguration;
        private @Nullable Input<List<AssistantTagArgs>> tags;
        private Input<AssistantType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(AssistantArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.serverSideEncryptionConfiguration = defaults.serverSideEncryptionConfiguration;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
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

        public Builder setServerSideEncryptionConfiguration(@Nullable Input<AssistantServerSideEncryptionConfigurationArgs> serverSideEncryptionConfiguration) {
            this.serverSideEncryptionConfiguration = serverSideEncryptionConfiguration;
            return this;
        }

        public Builder setServerSideEncryptionConfiguration(@Nullable AssistantServerSideEncryptionConfigurationArgs serverSideEncryptionConfiguration) {
            this.serverSideEncryptionConfiguration = Input.ofNullable(serverSideEncryptionConfiguration);
            return this;
        }

        public Builder setTags(@Nullable Input<List<AssistantTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<AssistantTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setType(Input<AssistantType> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(AssistantType type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public AssistantArgs build() {
            return new AssistantArgs(description, name, serverSideEncryptionConfiguration, tags, type);
        }
    }
}
