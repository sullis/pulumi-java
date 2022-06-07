// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.metastore_v1beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetMetadataImportPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMetadataImportPlainArgs Empty = new GetMetadataImportPlainArgs();

    @Import(name="location", required=true)
    private String location;

    public String location() {
        return this.location;
    }

    @Import(name="metadataImportId", required=true)
    private String metadataImportId;

    public String metadataImportId() {
        return this.metadataImportId;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="serviceId", required=true)
    private String serviceId;

    public String serviceId() {
        return this.serviceId;
    }

    private GetMetadataImportPlainArgs() {}

    private GetMetadataImportPlainArgs(GetMetadataImportPlainArgs $) {
        this.location = $.location;
        this.metadataImportId = $.metadataImportId;
        this.project = $.project;
        this.serviceId = $.serviceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMetadataImportPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMetadataImportPlainArgs $;

        public Builder() {
            $ = new GetMetadataImportPlainArgs();
        }

        public Builder(GetMetadataImportPlainArgs defaults) {
            $ = new GetMetadataImportPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder metadataImportId(String metadataImportId) {
            $.metadataImportId = metadataImportId;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder serviceId(String serviceId) {
            $.serviceId = serviceId;
            return this;
        }

        public GetMetadataImportPlainArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.metadataImportId = Objects.requireNonNull($.metadataImportId, "expected parameter 'metadataImportId' to be non-null");
            $.serviceId = Objects.requireNonNull($.serviceId, "expected parameter 'serviceId' to be non-null");
            return $;
        }
    }

}
