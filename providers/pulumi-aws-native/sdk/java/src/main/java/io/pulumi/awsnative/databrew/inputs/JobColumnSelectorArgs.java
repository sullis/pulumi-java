// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobColumnSelectorArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobColumnSelectorArgs Empty = new JobColumnSelectorArgs();

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="regex")
    private final @Nullable Input<String> regex;

    public Input<String> getRegex() {
        return this.regex == null ? Input.empty() : this.regex;
    }

    public JobColumnSelectorArgs(
        @Nullable Input<String> name,
        @Nullable Input<String> regex) {
        this.name = name;
        this.regex = regex;
    }

    private JobColumnSelectorArgs() {
        this.name = Input.empty();
        this.regex = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobColumnSelectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;
        private @Nullable Input<String> regex;

        public Builder() {
    	      // Empty
        }

        public Builder(JobColumnSelectorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.regex = defaults.regex;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setRegex(@Nullable Input<String> regex) {
            this.regex = regex;
            return this;
        }

        public Builder setRegex(@Nullable String regex) {
            this.regex = Input.ofNullable(regex);
            return this;
        }

        public JobColumnSelectorArgs build() {
            return new JobColumnSelectorArgs(name, regex);
        }
    }
}
