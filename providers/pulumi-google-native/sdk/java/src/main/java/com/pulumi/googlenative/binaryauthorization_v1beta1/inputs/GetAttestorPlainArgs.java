// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.binaryauthorization_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAttestorPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAttestorPlainArgs Empty = new GetAttestorPlainArgs();

    @Import(name="attestorId", required=true)
    private String attestorId;

    public String attestorId() {
        return this.attestorId;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetAttestorPlainArgs() {}

    private GetAttestorPlainArgs(GetAttestorPlainArgs $) {
        this.attestorId = $.attestorId;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAttestorPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAttestorPlainArgs $;

        public Builder() {
            $ = new GetAttestorPlainArgs();
        }

        public Builder(GetAttestorPlainArgs defaults) {
            $ = new GetAttestorPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder attestorId(String attestorId) {
            $.attestorId = attestorId;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetAttestorPlainArgs build() {
            $.attestorId = Objects.requireNonNull($.attestorId, "expected parameter 'attestorId' to be non-null");
            return $;
        }
    }

}
