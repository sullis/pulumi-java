// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ssm.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetResourceDataSyncArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetResourceDataSyncArgs Empty = new GetResourceDataSyncArgs();

    @Import(name="syncName", required=true)
    private Output<String> syncName;

    public Output<String> syncName() {
        return this.syncName;
    }

    private GetResourceDataSyncArgs() {}

    private GetResourceDataSyncArgs(GetResourceDataSyncArgs $) {
        this.syncName = $.syncName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetResourceDataSyncArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetResourceDataSyncArgs $;

        public Builder() {
            $ = new GetResourceDataSyncArgs();
        }

        public Builder(GetResourceDataSyncArgs defaults) {
            $ = new GetResourceDataSyncArgs(Objects.requireNonNull(defaults));
        }

        public Builder syncName(Output<String> syncName) {
            $.syncName = syncName;
            return this;
        }

        public Builder syncName(String syncName) {
            return syncName(Output.of(syncName));
        }

        public GetResourceDataSyncArgs build() {
            $.syncName = Objects.requireNonNull($.syncName, "expected parameter 'syncName' to be non-null");
            return $;
        }
    }

}
