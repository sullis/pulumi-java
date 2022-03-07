// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.budgets.inputs;

import io.pulumi.awsnative.budgets.enums.BudgetsActionSsmActionDefinitionSubtype;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class BudgetsActionSsmActionDefinition extends io.pulumi.resources.InvokeArgs {

    public static final BudgetsActionSsmActionDefinition Empty = new BudgetsActionSsmActionDefinition();

    @InputImport(name="instanceIds", required=true)
      private final List<String> instanceIds;

    public List<String> getInstanceIds() {
        return this.instanceIds;
    }

    @InputImport(name="region", required=true)
      private final String region;

    public String getRegion() {
        return this.region;
    }

    @InputImport(name="subtype", required=true)
      private final BudgetsActionSsmActionDefinitionSubtype subtype;

    public BudgetsActionSsmActionDefinitionSubtype getSubtype() {
        return this.subtype;
    }

    public BudgetsActionSsmActionDefinition(
        List<String> instanceIds,
        String region,
        BudgetsActionSsmActionDefinitionSubtype subtype) {
        this.instanceIds = Objects.requireNonNull(instanceIds, "expected parameter 'instanceIds' to be non-null");
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
        this.subtype = Objects.requireNonNull(subtype, "expected parameter 'subtype' to be non-null");
    }

    private BudgetsActionSsmActionDefinition() {
        this.instanceIds = List.of();
        this.region = null;
        this.subtype = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BudgetsActionSsmActionDefinition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> instanceIds;
        private String region;
        private BudgetsActionSsmActionDefinitionSubtype subtype;

        public Builder() {
    	      // Empty
        }

        public Builder(BudgetsActionSsmActionDefinition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceIds = defaults.instanceIds;
    	      this.region = defaults.region;
    	      this.subtype = defaults.subtype;
        }

        public Builder setInstanceIds(List<String> instanceIds) {
            this.instanceIds = Objects.requireNonNull(instanceIds);
            return this;
        }

        public Builder setRegion(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder setSubtype(BudgetsActionSsmActionDefinitionSubtype subtype) {
            this.subtype = Objects.requireNonNull(subtype);
            return this;
        }
        public BudgetsActionSsmActionDefinition build() {
            return new BudgetsActionSsmActionDefinition(instanceIds, region, subtype);
        }
    }
}