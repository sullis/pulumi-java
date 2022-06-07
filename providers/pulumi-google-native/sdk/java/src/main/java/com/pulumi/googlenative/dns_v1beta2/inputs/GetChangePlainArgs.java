// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dns_v1beta2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetChangePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetChangePlainArgs Empty = new GetChangePlainArgs();

    @Import(name="changeId", required=true)
    private String changeId;

    public String changeId() {
        return this.changeId;
    }

    @Import(name="clientOperationId")
    private @Nullable String clientOperationId;

    public Optional<String> clientOperationId() {
        return Optional.ofNullable(this.clientOperationId);
    }

    @Import(name="managedZone", required=true)
    private String managedZone;

    public String managedZone() {
        return this.managedZone;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetChangePlainArgs() {}

    private GetChangePlainArgs(GetChangePlainArgs $) {
        this.changeId = $.changeId;
        this.clientOperationId = $.clientOperationId;
        this.managedZone = $.managedZone;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetChangePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetChangePlainArgs $;

        public Builder() {
            $ = new GetChangePlainArgs();
        }

        public Builder(GetChangePlainArgs defaults) {
            $ = new GetChangePlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder changeId(String changeId) {
            $.changeId = changeId;
            return this;
        }

        public Builder clientOperationId(@Nullable String clientOperationId) {
            $.clientOperationId = clientOperationId;
            return this;
        }

        public Builder managedZone(String managedZone) {
            $.managedZone = managedZone;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetChangePlainArgs build() {
            $.changeId = Objects.requireNonNull($.changeId, "expected parameter 'changeId' to be non-null");
            $.managedZone = Objects.requireNonNull($.managedZone, "expected parameter 'managedZone' to be non-null");
            return $;
        }
    }

}
