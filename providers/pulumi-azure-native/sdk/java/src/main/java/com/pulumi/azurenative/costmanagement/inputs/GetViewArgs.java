// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.costmanagement.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetViewArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetViewArgs Empty = new GetViewArgs();

    /**
     * View name
     * 
     */
    @Import(name="viewName", required=true)
    private Output<String> viewName;

    /**
     * @return View name
     * 
     */
    public Output<String> viewName() {
        return this.viewName;
    }

    private GetViewArgs() {}

    private GetViewArgs(GetViewArgs $) {
        this.viewName = $.viewName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetViewArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetViewArgs $;

        public Builder() {
            $ = new GetViewArgs();
        }

        public Builder(GetViewArgs defaults) {
            $ = new GetViewArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param viewName View name
         * 
         * @return builder
         * 
         */
        public Builder viewName(Output<String> viewName) {
            $.viewName = viewName;
            return this;
        }

        /**
         * @param viewName View name
         * 
         * @return builder
         * 
         */
        public Builder viewName(String viewName) {
            return viewName(Output.of(viewName));
        }

        public GetViewArgs build() {
            $.viewName = Objects.requireNonNull($.viewName, "expected parameter 'viewName' to be non-null");
            return $;
        }
    }

}
