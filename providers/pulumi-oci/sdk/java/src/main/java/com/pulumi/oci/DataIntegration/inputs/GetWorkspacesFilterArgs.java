// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataIntegration.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetWorkspacesFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetWorkspacesFilterArgs Empty = new GetWorkspacesFilterArgs();

    /**
     * Used to filter by the name of the object.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Used to filter by the name of the object.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    @Import(name="regex")
    private @Nullable Output<Boolean> regex;

    public Optional<Output<Boolean>> regex() {
        return Optional.ofNullable(this.regex);
    }

    @Import(name="values", required=true)
    private Output<List<String>> values;

    public Output<List<String>> values() {
        return this.values;
    }

    private GetWorkspacesFilterArgs() {}

    private GetWorkspacesFilterArgs(GetWorkspacesFilterArgs $) {
        this.name = $.name;
        this.regex = $.regex;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWorkspacesFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWorkspacesFilterArgs $;

        public Builder() {
            $ = new GetWorkspacesFilterArgs();
        }

        public Builder(GetWorkspacesFilterArgs defaults) {
            $ = new GetWorkspacesFilterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Used to filter by the name of the object.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Used to filter by the name of the object.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder regex(@Nullable Output<Boolean> regex) {
            $.regex = regex;
            return this;
        }

        public Builder regex(Boolean regex) {
            return regex(Output.of(regex));
        }

        public Builder values(Output<List<String>> values) {
            $.values = values;
            return this;
        }

        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        public Builder values(String... values) {
            return values(List.of(values));
        }

        public GetWorkspacesFilterArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.values = Objects.requireNonNull($.values, "expected parameter 'values' to be non-null");
            return $;
        }
    }

}
