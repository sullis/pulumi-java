// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ssm.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DocumentParameterArgs extends io.pulumi.resources.ResourceArgs {

    public static final DocumentParameterArgs Empty = new DocumentParameterArgs();

    @Import(name="defaultValue")
      private final @Nullable Output<String> defaultValue;

    public Output<String> getDefaultValue() {
        return this.defaultValue == null ? Output.empty() : this.defaultValue;
    }

    /**
     * The description of the document.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The name of the document.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> getType() {
        return this.type == null ? Output.empty() : this.type;
    }

    public DocumentParameterArgs(
        @Nullable Output<String> defaultValue,
        @Nullable Output<String> description,
        @Nullable Output<String> name,
        @Nullable Output<String> type) {
        this.defaultValue = defaultValue;
        this.description = description;
        this.name = name;
        this.type = type;
    }

    private DocumentParameterArgs() {
        this.defaultValue = Output.empty();
        this.description = Output.empty();
        this.name = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DocumentParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> defaultValue;
        private @Nullable Output<String> description;
        private @Nullable Output<String> name;
        private @Nullable Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(DocumentParameterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultValue = defaults.defaultValue;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder defaultValue(@Nullable Output<String> defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public Builder defaultValue(@Nullable String defaultValue) {
            this.defaultValue = Output.ofNullable(defaultValue);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = Output.ofNullable(type);
            return this;
        }        public DocumentParameterArgs build() {
            return new DocumentParameterArgs(defaultValue, description, name, type);
        }
    }
}
