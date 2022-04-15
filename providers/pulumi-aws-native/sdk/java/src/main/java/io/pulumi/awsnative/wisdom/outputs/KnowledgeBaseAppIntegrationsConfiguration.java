// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wisdom.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class KnowledgeBaseAppIntegrationsConfiguration {
    private final String appIntegrationArn;
    private final List<String> objectFields;

    @CustomType.Constructor
    private KnowledgeBaseAppIntegrationsConfiguration(
        @CustomType.Parameter("appIntegrationArn") String appIntegrationArn,
        @CustomType.Parameter("objectFields") List<String> objectFields) {
        this.appIntegrationArn = appIntegrationArn;
        this.objectFields = objectFields;
    }

    public String appIntegrationArn() {
        return this.appIntegrationArn;
    }
    public List<String> objectFields() {
        return this.objectFields;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KnowledgeBaseAppIntegrationsConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String appIntegrationArn;
        private List<String> objectFields;

        public Builder() {
    	      // Empty
        }

        public Builder(KnowledgeBaseAppIntegrationsConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appIntegrationArn = defaults.appIntegrationArn;
    	      this.objectFields = defaults.objectFields;
        }

        public Builder appIntegrationArn(String appIntegrationArn) {
            this.appIntegrationArn = Objects.requireNonNull(appIntegrationArn);
            return this;
        }
        public Builder objectFields(List<String> objectFields) {
            this.objectFields = Objects.requireNonNull(objectFields);
            return this;
        }
        public Builder objectFields(String... objectFields) {
            return objectFields(List.of(objectFields));
        }        public KnowledgeBaseAppIntegrationsConfiguration build() {
            return new KnowledgeBaseAppIntegrationsConfiguration(appIntegrationArn, objectFields);
        }
    }
}
