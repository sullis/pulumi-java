// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.panorama.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetApplicationInstanceArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetApplicationInstanceArgs Empty = new GetApplicationInstanceArgs();

    @Import(name="applicationInstanceId", required=true)
    private Output<String> applicationInstanceId;

    public Output<String> applicationInstanceId() {
        return this.applicationInstanceId;
    }

    private GetApplicationInstanceArgs() {}

    private GetApplicationInstanceArgs(GetApplicationInstanceArgs $) {
        this.applicationInstanceId = $.applicationInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetApplicationInstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetApplicationInstanceArgs $;

        public Builder() {
            $ = new GetApplicationInstanceArgs();
        }

        public Builder(GetApplicationInstanceArgs defaults) {
            $ = new GetApplicationInstanceArgs(Objects.requireNonNull(defaults));
        }

        public Builder applicationInstanceId(Output<String> applicationInstanceId) {
            $.applicationInstanceId = applicationInstanceId;
            return this;
        }

        public Builder applicationInstanceId(String applicationInstanceId) {
            return applicationInstanceId(Output.of(applicationInstanceId));
        }

        public GetApplicationInstanceArgs build() {
            $.applicationInstanceId = Objects.requireNonNull($.applicationInstanceId, "expected parameter 'applicationInstanceId' to be non-null");
            return $;
        }
    }

}
