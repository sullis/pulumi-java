// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudformation.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetExportArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetExportArgs Empty = new GetExportArgs();

    /**
     * The name of the export as it appears in the console or from [list-exports](http://docs.aws.amazon.com/cli/latest/reference/cloudformation/list-exports.html)
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the export as it appears in the console or from [list-exports](http://docs.aws.amazon.com/cli/latest/reference/cloudformation/list-exports.html)
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private GetExportArgs() {}

    private GetExportArgs(GetExportArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetExportArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetExportArgs $;

        public Builder() {
            $ = new GetExportArgs();
        }

        public Builder(GetExportArgs defaults) {
            $ = new GetExportArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the export as it appears in the console or from [list-exports](http://docs.aws.amazon.com/cli/latest/reference/cloudformation/list-exports.html)
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the export as it appears in the console or from [list-exports](http://docs.aws.amazon.com/cli/latest/reference/cloudformation/list-exports.html)
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GetExportArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
