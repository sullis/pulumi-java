// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetForwardingRulePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetForwardingRulePlainArgs Empty = new GetForwardingRulePlainArgs();

    @Import(name="forwardingRule", required=true)
    private String forwardingRule;

    public String forwardingRule() {
        return this.forwardingRule;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="region", required=true)
    private String region;

    public String region() {
        return this.region;
    }

    private GetForwardingRulePlainArgs() {}

    private GetForwardingRulePlainArgs(GetForwardingRulePlainArgs $) {
        this.forwardingRule = $.forwardingRule;
        this.project = $.project;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetForwardingRulePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetForwardingRulePlainArgs $;

        public Builder() {
            $ = new GetForwardingRulePlainArgs();
        }

        public Builder(GetForwardingRulePlainArgs defaults) {
            $ = new GetForwardingRulePlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder forwardingRule(String forwardingRule) {
            $.forwardingRule = forwardingRule;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder region(String region) {
            $.region = region;
            return this;
        }

        public GetForwardingRulePlainArgs build() {
            $.forwardingRule = Objects.requireNonNull($.forwardingRule, "expected parameter 'forwardingRule' to be non-null");
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            return $;
        }
    }

}
