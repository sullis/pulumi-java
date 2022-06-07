// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.healthcare_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetConsentPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetConsentPlainArgs Empty = new GetConsentPlainArgs();

    @Import(name="consentId", required=true)
    private String consentId;

    public String consentId() {
        return this.consentId;
    }

    @Import(name="consentStoreId", required=true)
    private String consentStoreId;

    public String consentStoreId() {
        return this.consentStoreId;
    }

    @Import(name="datasetId", required=true)
    private String datasetId;

    public String datasetId() {
        return this.datasetId;
    }

    @Import(name="location", required=true)
    private String location;

    public String location() {
        return this.location;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetConsentPlainArgs() {}

    private GetConsentPlainArgs(GetConsentPlainArgs $) {
        this.consentId = $.consentId;
        this.consentStoreId = $.consentStoreId;
        this.datasetId = $.datasetId;
        this.location = $.location;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetConsentPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetConsentPlainArgs $;

        public Builder() {
            $ = new GetConsentPlainArgs();
        }

        public Builder(GetConsentPlainArgs defaults) {
            $ = new GetConsentPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder consentId(String consentId) {
            $.consentId = consentId;
            return this;
        }

        public Builder consentStoreId(String consentStoreId) {
            $.consentStoreId = consentStoreId;
            return this;
        }

        public Builder datasetId(String datasetId) {
            $.datasetId = datasetId;
            return this;
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetConsentPlainArgs build() {
            $.consentId = Objects.requireNonNull($.consentId, "expected parameter 'consentId' to be non-null");
            $.consentStoreId = Objects.requireNonNull($.consentStoreId, "expected parameter 'consentStoreId' to be non-null");
            $.datasetId = Objects.requireNonNull($.datasetId, "expected parameter 'datasetId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
