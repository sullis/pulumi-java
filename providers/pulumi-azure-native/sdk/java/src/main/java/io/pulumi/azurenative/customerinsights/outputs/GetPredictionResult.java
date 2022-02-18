// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.outputs;

import io.pulumi.azurenative.customerinsights.outputs.PredictionResponseGrades;
import io.pulumi.azurenative.customerinsights.outputs.PredictionResponseMappings;
import io.pulumi.azurenative.customerinsights.outputs.PredictionResponseSystemGeneratedEntities;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetPredictionResult {
    /**
     * Whether do auto analyze.
     * 
     */
    private final Boolean autoAnalyze;
    /**
     * Description of the prediction.
     * 
     */
    private final @Nullable Map<String,String> description;
    /**
     * Display name of the prediction.
     * 
     */
    private final @Nullable Map<String,String> displayName;
    /**
     * The prediction grades.
     * 
     */
    private final @Nullable List<PredictionResponseGrades> grades;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * Interaction types involved in the prediction.
     * 
     */
    private final @Nullable List<String> involvedInteractionTypes;
    /**
     * KPI types involved in the prediction.
     * 
     */
    private final @Nullable List<String> involvedKpiTypes;
    /**
     * Relationships involved in the prediction.
     * 
     */
    private final @Nullable List<String> involvedRelationships;
    /**
     * Definition of the link mapping of prediction.
     * 
     */
    private final PredictionResponseMappings mappings;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * Negative outcome expression.
     * 
     */
    private final String negativeOutcomeExpression;
    /**
     * Positive outcome expression.
     * 
     */
    private final String positiveOutcomeExpression;
    /**
     * Name of the prediction.
     * 
     */
    private final @Nullable String predictionName;
    /**
     * Primary profile type.
     * 
     */
    private final String primaryProfileType;
    /**
     * Provisioning state.
     * 
     */
    private final String provisioningState;
    /**
     * Scope expression.
     * 
     */
    private final String scopeExpression;
    /**
     * Score label.
     * 
     */
    private final String scoreLabel;
    /**
     * System generated entities.
     * 
     */
    private final PredictionResponseSystemGeneratedEntities systemGeneratedEntities;
    /**
     * The hub name.
     * 
     */
    private final String tenantId;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"autoAnalyze","description","displayName","grades","id","involvedInteractionTypes","involvedKpiTypes","involvedRelationships","mappings","name","negativeOutcomeExpression","positiveOutcomeExpression","predictionName","primaryProfileType","provisioningState","scopeExpression","scoreLabel","systemGeneratedEntities","tenantId","type"})
    private GetPredictionResult(
        Boolean autoAnalyze,
        @Nullable Map<String,String> description,
        @Nullable Map<String,String> displayName,
        @Nullable List<PredictionResponseGrades> grades,
        String id,
        @Nullable List<String> involvedInteractionTypes,
        @Nullable List<String> involvedKpiTypes,
        @Nullable List<String> involvedRelationships,
        PredictionResponseMappings mappings,
        String name,
        String negativeOutcomeExpression,
        String positiveOutcomeExpression,
        @Nullable String predictionName,
        String primaryProfileType,
        String provisioningState,
        String scopeExpression,
        String scoreLabel,
        PredictionResponseSystemGeneratedEntities systemGeneratedEntities,
        String tenantId,
        String type) {
        this.autoAnalyze = Objects.requireNonNull(autoAnalyze);
        this.description = description;
        this.displayName = displayName;
        this.grades = grades;
        this.id = Objects.requireNonNull(id);
        this.involvedInteractionTypes = involvedInteractionTypes;
        this.involvedKpiTypes = involvedKpiTypes;
        this.involvedRelationships = involvedRelationships;
        this.mappings = Objects.requireNonNull(mappings);
        this.name = Objects.requireNonNull(name);
        this.negativeOutcomeExpression = Objects.requireNonNull(negativeOutcomeExpression);
        this.positiveOutcomeExpression = Objects.requireNonNull(positiveOutcomeExpression);
        this.predictionName = predictionName;
        this.primaryProfileType = Objects.requireNonNull(primaryProfileType);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.scopeExpression = Objects.requireNonNull(scopeExpression);
        this.scoreLabel = Objects.requireNonNull(scoreLabel);
        this.systemGeneratedEntities = Objects.requireNonNull(systemGeneratedEntities);
        this.tenantId = Objects.requireNonNull(tenantId);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Whether do auto analyze.
     * 
     */
    public Boolean getAutoAnalyze() {
        return this.autoAnalyze;
    }
    /**
     * Description of the prediction.
     * 
     */
    public Map<String,String> getDescription() {
        return this.description == null ? Map.of() : this.description;
    }
    /**
     * Display name of the prediction.
     * 
     */
    public Map<String,String> getDisplayName() {
        return this.displayName == null ? Map.of() : this.displayName;
    }
    /**
     * The prediction grades.
     * 
     */
    public List<PredictionResponseGrades> getGrades() {
        return this.grades == null ? List.of() : this.grades;
    }
    /**
     * Resource ID.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Interaction types involved in the prediction.
     * 
     */
    public List<String> getInvolvedInteractionTypes() {
        return this.involvedInteractionTypes == null ? List.of() : this.involvedInteractionTypes;
    }
    /**
     * KPI types involved in the prediction.
     * 
     */
    public List<String> getInvolvedKpiTypes() {
        return this.involvedKpiTypes == null ? List.of() : this.involvedKpiTypes;
    }
    /**
     * Relationships involved in the prediction.
     * 
     */
    public List<String> getInvolvedRelationships() {
        return this.involvedRelationships == null ? List.of() : this.involvedRelationships;
    }
    /**
     * Definition of the link mapping of prediction.
     * 
     */
    public PredictionResponseMappings getMappings() {
        return this.mappings;
    }
    /**
     * Resource name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Negative outcome expression.
     * 
     */
    public String getNegativeOutcomeExpression() {
        return this.negativeOutcomeExpression;
    }
    /**
     * Positive outcome expression.
     * 
     */
    public String getPositiveOutcomeExpression() {
        return this.positiveOutcomeExpression;
    }
    /**
     * Name of the prediction.
     * 
     */
    public Optional<String> getPredictionName() {
        return Optional.ofNullable(this.predictionName);
    }
    /**
     * Primary profile type.
     * 
     */
    public String getPrimaryProfileType() {
        return this.primaryProfileType;
    }
    /**
     * Provisioning state.
     * 
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Scope expression.
     * 
     */
    public String getScopeExpression() {
        return this.scopeExpression;
    }
    /**
     * Score label.
     * 
     */
    public String getScoreLabel() {
        return this.scoreLabel;
    }
    /**
     * System generated entities.
     * 
     */
    public PredictionResponseSystemGeneratedEntities getSystemGeneratedEntities() {
        return this.systemGeneratedEntities;
    }
    /**
     * The hub name.
     * 
     */
    public String getTenantId() {
        return this.tenantId;
    }
    /**
     * Resource type.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPredictionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean autoAnalyze;
        private @Nullable Map<String,String> description;
        private @Nullable Map<String,String> displayName;
        private @Nullable List<PredictionResponseGrades> grades;
        private String id;
        private @Nullable List<String> involvedInteractionTypes;
        private @Nullable List<String> involvedKpiTypes;
        private @Nullable List<String> involvedRelationships;
        private PredictionResponseMappings mappings;
        private String name;
        private String negativeOutcomeExpression;
        private String positiveOutcomeExpression;
        private @Nullable String predictionName;
        private String primaryProfileType;
        private String provisioningState;
        private String scopeExpression;
        private String scoreLabel;
        private PredictionResponseSystemGeneratedEntities systemGeneratedEntities;
        private String tenantId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPredictionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoAnalyze = defaults.autoAnalyze;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.grades = defaults.grades;
    	      this.id = defaults.id;
    	      this.involvedInteractionTypes = defaults.involvedInteractionTypes;
    	      this.involvedKpiTypes = defaults.involvedKpiTypes;
    	      this.involvedRelationships = defaults.involvedRelationships;
    	      this.mappings = defaults.mappings;
    	      this.name = defaults.name;
    	      this.negativeOutcomeExpression = defaults.negativeOutcomeExpression;
    	      this.positiveOutcomeExpression = defaults.positiveOutcomeExpression;
    	      this.predictionName = defaults.predictionName;
    	      this.primaryProfileType = defaults.primaryProfileType;
    	      this.provisioningState = defaults.provisioningState;
    	      this.scopeExpression = defaults.scopeExpression;
    	      this.scoreLabel = defaults.scoreLabel;
    	      this.systemGeneratedEntities = defaults.systemGeneratedEntities;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
        }

        public Builder setAutoAnalyze(Boolean autoAnalyze) {
            this.autoAnalyze = Objects.requireNonNull(autoAnalyze);
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

        public Builder setGrades(@Nullable List<PredictionResponseGrades> grades) {
            this.grades = grades;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setInvolvedInteractionTypes(@Nullable List<String> involvedInteractionTypes) {
            this.involvedInteractionTypes = involvedInteractionTypes;
            return this;
        }

        public Builder setInvolvedKpiTypes(@Nullable List<String> involvedKpiTypes) {
            this.involvedKpiTypes = involvedKpiTypes;
            return this;
        }

        public Builder setInvolvedRelationships(@Nullable List<String> involvedRelationships) {
            this.involvedRelationships = involvedRelationships;
            return this;
        }

        public Builder setMappings(PredictionResponseMappings mappings) {
            this.mappings = Objects.requireNonNull(mappings);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNegativeOutcomeExpression(String negativeOutcomeExpression) {
            this.negativeOutcomeExpression = Objects.requireNonNull(negativeOutcomeExpression);
            return this;
        }

        public Builder setPositiveOutcomeExpression(String positiveOutcomeExpression) {
            this.positiveOutcomeExpression = Objects.requireNonNull(positiveOutcomeExpression);
            return this;
        }

        public Builder setPredictionName(@Nullable String predictionName) {
            this.predictionName = predictionName;
            return this;
        }

        public Builder setPrimaryProfileType(String primaryProfileType) {
            this.primaryProfileType = Objects.requireNonNull(primaryProfileType);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setScopeExpression(String scopeExpression) {
            this.scopeExpression = Objects.requireNonNull(scopeExpression);
            return this;
        }

        public Builder setScoreLabel(String scoreLabel) {
            this.scoreLabel = Objects.requireNonNull(scoreLabel);
            return this;
        }

        public Builder setSystemGeneratedEntities(PredictionResponseSystemGeneratedEntities systemGeneratedEntities) {
            this.systemGeneratedEntities = Objects.requireNonNull(systemGeneratedEntities);
            return this;
        }

        public Builder setTenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetPredictionResult build() {
            return new GetPredictionResult(autoAnalyze, description, displayName, grades, id, involvedInteractionTypes, involvedKpiTypes, involvedRelationships, mappings, name, negativeOutcomeExpression, positiveOutcomeExpression, predictionName, primaryProfileType, provisioningState, scopeExpression, scoreLabel, systemGeneratedEntities, tenantId, type);
        }
    }
}
