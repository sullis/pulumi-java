// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ssmincidents.inputs;

import io.pulumi.awsnative.ssmincidents.inputs.ResponsePlanNotificationTargetItem;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The incident template configuration.
 * 
 */
public final class ResponsePlanIncidentTemplate extends io.pulumi.resources.InvokeArgs {

    public static final ResponsePlanIncidentTemplate Empty = new ResponsePlanIncidentTemplate();

    /**
     * The deduplication string.
     * 
     */
    @Import(name="dedupeString")
      private final @Nullable String dedupeString;

    public Optional<String> dedupeString() {
        return this.dedupeString == null ? Optional.empty() : Optional.ofNullable(this.dedupeString);
    }

    /**
     * The impact value.
     * 
     */
    @Import(name="impact", required=true)
      private final Integer impact;

    public Integer impact() {
        return this.impact;
    }

    /**
     * The list of notification targets.
     * 
     */
    @Import(name="notificationTargets")
      private final @Nullable List<ResponsePlanNotificationTargetItem> notificationTargets;

    public List<ResponsePlanNotificationTargetItem> notificationTargets() {
        return this.notificationTargets == null ? List.of() : this.notificationTargets;
    }

    /**
     * The summary string.
     * 
     */
    @Import(name="summary")
      private final @Nullable String summary;

    public Optional<String> summary() {
        return this.summary == null ? Optional.empty() : Optional.ofNullable(this.summary);
    }

    /**
     * The title string.
     * 
     */
    @Import(name="title", required=true)
      private final String title;

    public String title() {
        return this.title;
    }

    public ResponsePlanIncidentTemplate(
        @Nullable String dedupeString,
        Integer impact,
        @Nullable List<ResponsePlanNotificationTargetItem> notificationTargets,
        @Nullable String summary,
        String title) {
        this.dedupeString = dedupeString;
        this.impact = Objects.requireNonNull(impact, "expected parameter 'impact' to be non-null");
        this.notificationTargets = notificationTargets;
        this.summary = summary;
        this.title = Objects.requireNonNull(title, "expected parameter 'title' to be non-null");
    }

    private ResponsePlanIncidentTemplate() {
        this.dedupeString = null;
        this.impact = null;
        this.notificationTargets = List.of();
        this.summary = null;
        this.title = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponsePlanIncidentTemplate defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String dedupeString;
        private Integer impact;
        private @Nullable List<ResponsePlanNotificationTargetItem> notificationTargets;
        private @Nullable String summary;
        private String title;

        public Builder() {
    	      // Empty
        }

        public Builder(ResponsePlanIncidentTemplate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dedupeString = defaults.dedupeString;
    	      this.impact = defaults.impact;
    	      this.notificationTargets = defaults.notificationTargets;
    	      this.summary = defaults.summary;
    	      this.title = defaults.title;
        }

        public Builder dedupeString(@Nullable String dedupeString) {
            this.dedupeString = dedupeString;
            return this;
        }
        public Builder impact(Integer impact) {
            this.impact = Objects.requireNonNull(impact);
            return this;
        }
        public Builder notificationTargets(@Nullable List<ResponsePlanNotificationTargetItem> notificationTargets) {
            this.notificationTargets = notificationTargets;
            return this;
        }
        public Builder notificationTargets(ResponsePlanNotificationTargetItem... notificationTargets) {
            return notificationTargets(List.of(notificationTargets));
        }
        public Builder summary(@Nullable String summary) {
            this.summary = summary;
            return this;
        }
        public Builder title(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }        public ResponsePlanIncidentTemplate build() {
            return new ResponsePlanIncidentTemplate(dedupeString, impact, notificationTargets, summary, title);
        }
    }
}
