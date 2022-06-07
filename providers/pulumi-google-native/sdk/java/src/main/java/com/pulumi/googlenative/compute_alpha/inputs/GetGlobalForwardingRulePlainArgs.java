// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGlobalForwardingRulePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetGlobalForwardingRulePlainArgs Empty = new GetGlobalForwardingRulePlainArgs();

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

    private GetGlobalForwardingRulePlainArgs() {}

    private GetGlobalForwardingRulePlainArgs(GetGlobalForwardingRulePlainArgs $) {
        this.forwardingRule = $.forwardingRule;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGlobalForwardingRulePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGlobalForwardingRulePlainArgs $;

        public Builder() {
            $ = new GetGlobalForwardingRulePlainArgs();
        }

        public Builder(GetGlobalForwardingRulePlainArgs defaults) {
            $ = new GetGlobalForwardingRulePlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder forwardingRule(String forwardingRule) {
            $.forwardingRule = forwardingRule;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetGlobalForwardingRulePlainArgs build() {
            $.forwardingRule = Objects.requireNonNull($.forwardingRule, "expected parameter 'forwardingRule' to be non-null");
            return $;
        }
    }

}
