// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudtrace_v2beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTraceSinkPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTraceSinkPlainArgs Empty = new GetTraceSinkPlainArgs();

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="traceSinkId", required=true)
    private String traceSinkId;

    public String traceSinkId() {
        return this.traceSinkId;
    }

    private GetTraceSinkPlainArgs() {}

    private GetTraceSinkPlainArgs(GetTraceSinkPlainArgs $) {
        this.project = $.project;
        this.traceSinkId = $.traceSinkId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTraceSinkPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTraceSinkPlainArgs $;

        public Builder() {
            $ = new GetTraceSinkPlainArgs();
        }

        public Builder(GetTraceSinkPlainArgs defaults) {
            $ = new GetTraceSinkPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder traceSinkId(String traceSinkId) {
            $.traceSinkId = traceSinkId;
            return this;
        }

        public GetTraceSinkPlainArgs build() {
            $.traceSinkId = Objects.requireNonNull($.traceSinkId, "expected parameter 'traceSinkId' to be non-null");
            return $;
        }
    }

}
