// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.healthcare_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetFhirArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFhirArgs Empty = new GetFhirArgs();

    @Import(name="datasetId", required=true)
    private Output<String> datasetId;

    public Output<String> datasetId() {
        return this.datasetId;
    }

    @Import(name="fhirId", required=true)
    private Output<String> fhirId;

    public Output<String> fhirId() {
        return this.fhirId;
    }

    @Import(name="fhirId1", required=true)
    private Output<String> fhirId1;

    public Output<String> fhirId1() {
        return this.fhirId1;
    }

    @Import(name="fhirStoreId", required=true)
    private Output<String> fhirStoreId;

    public Output<String> fhirStoreId() {
        return this.fhirStoreId;
    }

    @Import(name="location", required=true)
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private GetFhirArgs() {}

    private GetFhirArgs(GetFhirArgs $) {
        this.datasetId = $.datasetId;
        this.fhirId = $.fhirId;
        this.fhirId1 = $.fhirId1;
        this.fhirStoreId = $.fhirStoreId;
        this.location = $.location;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFhirArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFhirArgs $;

        public Builder() {
            $ = new GetFhirArgs();
        }

        public Builder(GetFhirArgs defaults) {
            $ = new GetFhirArgs(Objects.requireNonNull(defaults));
        }

        public Builder datasetId(Output<String> datasetId) {
            $.datasetId = datasetId;
            return this;
        }

        public Builder datasetId(String datasetId) {
            return datasetId(Output.of(datasetId));
        }

        public Builder fhirId(Output<String> fhirId) {
            $.fhirId = fhirId;
            return this;
        }

        public Builder fhirId(String fhirId) {
            return fhirId(Output.of(fhirId));
        }

        public Builder fhirId1(Output<String> fhirId1) {
            $.fhirId1 = fhirId1;
            return this;
        }

        public Builder fhirId1(String fhirId1) {
            return fhirId1(Output.of(fhirId1));
        }

        public Builder fhirStoreId(Output<String> fhirStoreId) {
            $.fhirStoreId = fhirStoreId;
            return this;
        }

        public Builder fhirStoreId(String fhirStoreId) {
            return fhirStoreId(Output.of(fhirStoreId));
        }

        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public GetFhirArgs build() {
            $.datasetId = Objects.requireNonNull($.datasetId, "expected parameter 'datasetId' to be non-null");
            $.fhirId = Objects.requireNonNull($.fhirId, "expected parameter 'fhirId' to be non-null");
            $.fhirId1 = Objects.requireNonNull($.fhirId1, "expected parameter 'fhirId1' to be non-null");
            $.fhirStoreId = Objects.requireNonNull($.fhirStoreId, "expected parameter 'fhirStoreId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
