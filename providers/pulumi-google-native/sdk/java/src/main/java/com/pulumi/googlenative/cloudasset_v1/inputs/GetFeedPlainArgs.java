// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudasset_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetFeedPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFeedPlainArgs Empty = new GetFeedPlainArgs();

    @Import(name="feedId", required=true)
    private String feedId;

    public String feedId() {
        return this.feedId;
    }

    @Import(name="v1Id", required=true)
    private String v1Id;

    public String v1Id() {
        return this.v1Id;
    }

    @Import(name="v1Id1", required=true)
    private String v1Id1;

    public String v1Id1() {
        return this.v1Id1;
    }

    private GetFeedPlainArgs() {}

    private GetFeedPlainArgs(GetFeedPlainArgs $) {
        this.feedId = $.feedId;
        this.v1Id = $.v1Id;
        this.v1Id1 = $.v1Id1;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFeedPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFeedPlainArgs $;

        public Builder() {
            $ = new GetFeedPlainArgs();
        }

        public Builder(GetFeedPlainArgs defaults) {
            $ = new GetFeedPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder feedId(String feedId) {
            $.feedId = feedId;
            return this;
        }

        public Builder v1Id(String v1Id) {
            $.v1Id = v1Id;
            return this;
        }

        public Builder v1Id1(String v1Id1) {
            $.v1Id1 = v1Id1;
            return this;
        }

        public GetFeedPlainArgs build() {
            $.feedId = Objects.requireNonNull($.feedId, "expected parameter 'feedId' to be non-null");
            $.v1Id = Objects.requireNonNull($.v1Id, "expected parameter 'v1Id' to be non-null");
            $.v1Id1 = Objects.requireNonNull($.v1Id1, "expected parameter 'v1Id1' to be non-null");
            return $;
        }
    }

}
