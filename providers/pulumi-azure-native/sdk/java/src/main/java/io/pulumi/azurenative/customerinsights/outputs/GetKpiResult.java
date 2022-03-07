// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.outputs;

import io.pulumi.azurenative.customerinsights.outputs.KpiAliasResponse;
import io.pulumi.azurenative.customerinsights.outputs.KpiExtractResponse;
import io.pulumi.azurenative.customerinsights.outputs.KpiGroupByMetadataResponse;
import io.pulumi.azurenative.customerinsights.outputs.KpiParticipantProfilesMetadataResponse;
import io.pulumi.azurenative.customerinsights.outputs.KpiThresholdsResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetKpiResult {
    /**
     * The aliases.
     * 
     */
    private final @Nullable List<KpiAliasResponse> aliases;
    /**
     * The calculation window.
     * 
     */
    private final String calculationWindow;
    /**
     * Name of calculation window field.
     * 
     */
    private final @Nullable String calculationWindowFieldName;
    /**
     * Localized description for the KPI.
     * 
     */
    private final @Nullable Map<String,String> description;
    /**
     * Localized display name for the KPI.
     * 
     */
    private final @Nullable Map<String,String> displayName;
    /**
     * The mapping entity type.
     * 
     */
    private final String entityType;
    /**
     * The mapping entity name.
     * 
     */
    private final String entityTypeName;
    /**
     * The computation expression for the KPI.
     * 
     */
    private final String expression;
    /**
     * The KPI extracts.
     * 
     */
    private final @Nullable List<KpiExtractResponse> extracts;
    /**
     * The filter expression for the KPI.
     * 
     */
    private final @Nullable String filter;
    /**
     * The computation function for the KPI.
     * 
     */
    private final String function;
    /**
     * the group by properties for the KPI.
     * 
     */
    private final @Nullable List<String> groupBy;
    /**
     * The KPI GroupByMetadata.
     * 
     */
    private final List<KpiGroupByMetadataResponse> groupByMetadata;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * The KPI name.
     * 
     */
    private final String kpiName;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * The participant profiles.
     * 
     */
    private final List<KpiParticipantProfilesMetadataResponse> participantProfilesMetadata;
    /**
     * Provisioning state.
     * 
     */
    private final String provisioningState;
    /**
     * The hub name.
     * 
     */
    private final String tenantId;
    /**
     * The KPI thresholds.
     * 
     */
    private final @Nullable KpiThresholdsResponse thresHolds;
    /**
     * Resource type.
     * 
     */
    private final String type;
    /**
     * The unit of measurement for the KPI.
     * 
     */
    private final @Nullable String unit;

    @OutputCustomType.Constructor({"aliases","calculationWindow","calculationWindowFieldName","description","displayName","entityType","entityTypeName","expression","extracts","filter","function","groupBy","groupByMetadata","id","kpiName","name","participantProfilesMetadata","provisioningState","tenantId","thresHolds","type","unit"})
    private GetKpiResult(
        @Nullable List<KpiAliasResponse> aliases,
        String calculationWindow,
        @Nullable String calculationWindowFieldName,
        @Nullable Map<String,String> description,
        @Nullable Map<String,String> displayName,
        String entityType,
        String entityTypeName,
        String expression,
        @Nullable List<KpiExtractResponse> extracts,
        @Nullable String filter,
        String function,
        @Nullable List<String> groupBy,
        List<KpiGroupByMetadataResponse> groupByMetadata,
        String id,
        String kpiName,
        String name,
        List<KpiParticipantProfilesMetadataResponse> participantProfilesMetadata,
        String provisioningState,
        String tenantId,
        @Nullable KpiThresholdsResponse thresHolds,
        String type,
        @Nullable String unit) {
        this.aliases = aliases;
        this.calculationWindow = Objects.requireNonNull(calculationWindow);
        this.calculationWindowFieldName = calculationWindowFieldName;
        this.description = description;
        this.displayName = displayName;
        this.entityType = Objects.requireNonNull(entityType);
        this.entityTypeName = Objects.requireNonNull(entityTypeName);
        this.expression = Objects.requireNonNull(expression);
        this.extracts = extracts;
        this.filter = filter;
        this.function = Objects.requireNonNull(function);
        this.groupBy = groupBy;
        this.groupByMetadata = Objects.requireNonNull(groupByMetadata);
        this.id = Objects.requireNonNull(id);
        this.kpiName = Objects.requireNonNull(kpiName);
        this.name = Objects.requireNonNull(name);
        this.participantProfilesMetadata = Objects.requireNonNull(participantProfilesMetadata);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.tenantId = Objects.requireNonNull(tenantId);
        this.thresHolds = thresHolds;
        this.type = Objects.requireNonNull(type);
        this.unit = unit;
    }

    /**
     * The aliases.
     * 
    */
    public List<KpiAliasResponse> getAliases() {
        return this.aliases == null ? List.of() : this.aliases;
    }
    /**
     * The calculation window.
     * 
    */
    public String getCalculationWindow() {
        return this.calculationWindow;
    }
    /**
     * Name of calculation window field.
     * 
    */
    public Optional<String> getCalculationWindowFieldName() {
        return Optional.ofNullable(this.calculationWindowFieldName);
    }
    /**
     * Localized description for the KPI.
     * 
    */
    public Map<String,String> getDescription() {
        return this.description == null ? Map.of() : this.description;
    }
    /**
     * Localized display name for the KPI.
     * 
    */
    public Map<String,String> getDisplayName() {
        return this.displayName == null ? Map.of() : this.displayName;
    }
    /**
     * The mapping entity type.
     * 
    */
    public String getEntityType() {
        return this.entityType;
    }
    /**
     * The mapping entity name.
     * 
    */
    public String getEntityTypeName() {
        return this.entityTypeName;
    }
    /**
     * The computation expression for the KPI.
     * 
    */
    public String getExpression() {
        return this.expression;
    }
    /**
     * The KPI extracts.
     * 
    */
    public List<KpiExtractResponse> getExtracts() {
        return this.extracts == null ? List.of() : this.extracts;
    }
    /**
     * The filter expression for the KPI.
     * 
    */
    public Optional<String> getFilter() {
        return Optional.ofNullable(this.filter);
    }
    /**
     * The computation function for the KPI.
     * 
    */
    public String getFunction() {
        return this.function;
    }
    /**
     * the group by properties for the KPI.
     * 
    */
    public List<String> getGroupBy() {
        return this.groupBy == null ? List.of() : this.groupBy;
    }
    /**
     * The KPI GroupByMetadata.
     * 
    */
    public List<KpiGroupByMetadataResponse> getGroupByMetadata() {
        return this.groupByMetadata;
    }
    /**
     * Resource ID.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The KPI name.
     * 
    */
    public String getKpiName() {
        return this.kpiName;
    }
    /**
     * Resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The participant profiles.
     * 
    */
    public List<KpiParticipantProfilesMetadataResponse> getParticipantProfilesMetadata() {
        return this.participantProfilesMetadata;
    }
    /**
     * Provisioning state.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The hub name.
     * 
    */
    public String getTenantId() {
        return this.tenantId;
    }
    /**
     * The KPI thresholds.
     * 
    */
    public Optional<KpiThresholdsResponse> getThresHolds() {
        return Optional.ofNullable(this.thresHolds);
    }
    /**
     * Resource type.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * The unit of measurement for the KPI.
     * 
    */
    public Optional<String> getUnit() {
        return Optional.ofNullable(this.unit);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKpiResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<KpiAliasResponse> aliases;
        private String calculationWindow;
        private @Nullable String calculationWindowFieldName;
        private @Nullable Map<String,String> description;
        private @Nullable Map<String,String> displayName;
        private String entityType;
        private String entityTypeName;
        private String expression;
        private @Nullable List<KpiExtractResponse> extracts;
        private @Nullable String filter;
        private String function;
        private @Nullable List<String> groupBy;
        private List<KpiGroupByMetadataResponse> groupByMetadata;
        private String id;
        private String kpiName;
        private String name;
        private List<KpiParticipantProfilesMetadataResponse> participantProfilesMetadata;
        private String provisioningState;
        private String tenantId;
        private @Nullable KpiThresholdsResponse thresHolds;
        private String type;
        private @Nullable String unit;

        public Builder() {
    	      // Empty
        }

        public Builder(GetKpiResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aliases = defaults.aliases;
    	      this.calculationWindow = defaults.calculationWindow;
    	      this.calculationWindowFieldName = defaults.calculationWindowFieldName;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.entityType = defaults.entityType;
    	      this.entityTypeName = defaults.entityTypeName;
    	      this.expression = defaults.expression;
    	      this.extracts = defaults.extracts;
    	      this.filter = defaults.filter;
    	      this.function = defaults.function;
    	      this.groupBy = defaults.groupBy;
    	      this.groupByMetadata = defaults.groupByMetadata;
    	      this.id = defaults.id;
    	      this.kpiName = defaults.kpiName;
    	      this.name = defaults.name;
    	      this.participantProfilesMetadata = defaults.participantProfilesMetadata;
    	      this.provisioningState = defaults.provisioningState;
    	      this.tenantId = defaults.tenantId;
    	      this.thresHolds = defaults.thresHolds;
    	      this.type = defaults.type;
    	      this.unit = defaults.unit;
        }

        public Builder setAliases(@Nullable List<KpiAliasResponse> aliases) {
            this.aliases = aliases;
            return this;
        }

        public Builder setCalculationWindow(String calculationWindow) {
            this.calculationWindow = Objects.requireNonNull(calculationWindow);
            return this;
        }

        public Builder setCalculationWindowFieldName(@Nullable String calculationWindowFieldName) {
            this.calculationWindowFieldName = calculationWindowFieldName;
            return this;
        }

        public Builder setDescription(@Nullable Map<String,String> description) {
            this.description = description;
            return this;
        }

        public Builder setDisplayName(@Nullable Map<String,String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setEntityType(String entityType) {
            this.entityType = Objects.requireNonNull(entityType);
            return this;
        }

        public Builder setEntityTypeName(String entityTypeName) {
            this.entityTypeName = Objects.requireNonNull(entityTypeName);
            return this;
        }

        public Builder setExpression(String expression) {
            this.expression = Objects.requireNonNull(expression);
            return this;
        }

        public Builder setExtracts(@Nullable List<KpiExtractResponse> extracts) {
            this.extracts = extracts;
            return this;
        }

        public Builder setFilter(@Nullable String filter) {
            this.filter = filter;
            return this;
        }

        public Builder setFunction(String function) {
            this.function = Objects.requireNonNull(function);
            return this;
        }

        public Builder setGroupBy(@Nullable List<String> groupBy) {
            this.groupBy = groupBy;
            return this;
        }

        public Builder setGroupByMetadata(List<KpiGroupByMetadataResponse> groupByMetadata) {
            this.groupByMetadata = Objects.requireNonNull(groupByMetadata);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setKpiName(String kpiName) {
            this.kpiName = Objects.requireNonNull(kpiName);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setParticipantProfilesMetadata(List<KpiParticipantProfilesMetadataResponse> participantProfilesMetadata) {
            this.participantProfilesMetadata = Objects.requireNonNull(participantProfilesMetadata);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setTenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }

        public Builder setThresHolds(@Nullable KpiThresholdsResponse thresHolds) {
            this.thresHolds = thresHolds;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUnit(@Nullable String unit) {
            this.unit = unit;
            return this;
        }
        public GetKpiResult build() {
            return new GetKpiResult(aliases, calculationWindow, calculationWindowFieldName, description, displayName, entityType, entityTypeName, expression, extracts, filter, function, groupBy, groupByMetadata, id, kpiName, name, participantProfilesMetadata, provisioningState, tenantId, thresHolds, type, unit);
        }
    }
}