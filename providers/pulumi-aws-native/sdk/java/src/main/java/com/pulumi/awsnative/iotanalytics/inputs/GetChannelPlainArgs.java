// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotanalytics.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetChannelPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetChannelPlainArgs Empty = new GetChannelPlainArgs();

    @Import(name="channelName", required=true)
    private String channelName;

    public String channelName() {
        return this.channelName;
    }

    private GetChannelPlainArgs() {}

    private GetChannelPlainArgs(GetChannelPlainArgs $) {
        this.channelName = $.channelName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetChannelPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetChannelPlainArgs $;

        public Builder() {
            $ = new GetChannelPlainArgs();
        }

        public Builder(GetChannelPlainArgs defaults) {
            $ = new GetChannelPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder channelName(String channelName) {
            $.channelName = channelName;
            return this;
        }

        public GetChannelPlainArgs build() {
            $.channelName = Objects.requireNonNull($.channelName, "expected parameter 'channelName' to be non-null");
            return $;
        }
    }

}
