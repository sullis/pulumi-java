// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class IncidentAdditionalDataResponse {
    /**
     * List of product names of alerts in the incident
     * 
     */
    private final List<String> alertProductNames;
    /**
     * The number of alerts in the incident
     * 
     */
    private final Integer alertsCount;
    /**
     * The number of bookmarks in the incident
     * 
     */
    private final Integer bookmarksCount;
    /**
     * The number of comments in the incident
     * 
     */
    private final Integer commentsCount;
    /**
     * The tactics associated with incident
     * 
     */
    private final List<String> tactics;

    @OutputCustomType.Constructor({"alertProductNames","alertsCount","bookmarksCount","commentsCount","tactics"})
    private IncidentAdditionalDataResponse(
        List<String> alertProductNames,
        Integer alertsCount,
        Integer bookmarksCount,
        Integer commentsCount,
        List<String> tactics) {
        this.alertProductNames = Objects.requireNonNull(alertProductNames);
        this.alertsCount = Objects.requireNonNull(alertsCount);
        this.bookmarksCount = Objects.requireNonNull(bookmarksCount);
        this.commentsCount = Objects.requireNonNull(commentsCount);
        this.tactics = Objects.requireNonNull(tactics);
    }

    /**
     * List of product names of alerts in the incident
     * 
     */
    public List<String> getAlertProductNames() {
        return this.alertProductNames;
    }
    /**
     * The number of alerts in the incident
     * 
     */
    public Integer getAlertsCount() {
        return this.alertsCount;
    }
    /**
     * The number of bookmarks in the incident
     * 
     */
    public Integer getBookmarksCount() {
        return this.bookmarksCount;
    }
    /**
     * The number of comments in the incident
     * 
     */
    public Integer getCommentsCount() {
        return this.commentsCount;
    }
    /**
     * The tactics associated with incident
     * 
     */
    public List<String> getTactics() {
        return this.tactics;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IncidentAdditionalDataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> alertProductNames;
        private Integer alertsCount;
        private Integer bookmarksCount;
        private Integer commentsCount;
        private List<String> tactics;

        public Builder() {
    	      // Empty
        }

        public Builder(IncidentAdditionalDataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alertProductNames = defaults.alertProductNames;
    	      this.alertsCount = defaults.alertsCount;
    	      this.bookmarksCount = defaults.bookmarksCount;
    	      this.commentsCount = defaults.commentsCount;
    	      this.tactics = defaults.tactics;
        }

        public Builder setAlertProductNames(List<String> alertProductNames) {
            this.alertProductNames = Objects.requireNonNull(alertProductNames);
            return this;
        }

        public Builder setAlertsCount(Integer alertsCount) {
            this.alertsCount = Objects.requireNonNull(alertsCount);
            return this;
        }

        public Builder setBookmarksCount(Integer bookmarksCount) {
            this.bookmarksCount = Objects.requireNonNull(bookmarksCount);
            return this;
        }

        public Builder setCommentsCount(Integer commentsCount) {
            this.commentsCount = Objects.requireNonNull(commentsCount);
            return this;
        }

        public Builder setTactics(List<String> tactics) {
            this.tactics = Objects.requireNonNull(tactics);
            return this;
        }

        public IncidentAdditionalDataResponse build() {
            return new IncidentAdditionalDataResponse(alertProductNames, alertsCount, bookmarksCount, commentsCount, tactics);
        }
    }
}
